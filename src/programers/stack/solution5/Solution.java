package programers.stack.solution5;

import java.util.LinkedList;
import java.util.Queue;

class Truck {
    int weight;
    int index;

    public Truck(int weight) {
        this.weight = weight;
        this.index = 0;
    }

    public void forward() {
        this.index += 1;
    }
}

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> truckQueue = new LinkedList<>();
        for (int w : truck_weights) {
            truckQueue.offer(new Truck(w));
        }

        int currentWeight = 0;
        int time = 0;
        Queue<Truck> outTruckQueue = new LinkedList<>();
        while (true) {
            outTruckQueue.forEach(Truck::forward);
            if (!outTruckQueue.isEmpty() && outTruckQueue.peek().index > bridge_length) {
                Truck t = outTruckQueue.poll();
                currentWeight -= t.weight;
            }

            if (!truckQueue.isEmpty() && (currentWeight + truckQueue.peek().weight) <= weight && outTruckQueue.size() < bridge_length) {
                Truck t = truckQueue.poll();
                t.forward();
                currentWeight += t.weight;
                outTruckQueue.offer(t);
            }

            time += 1;

            if (truckQueue.isEmpty() && outTruckQueue.isEmpty()) {
                break;
            }
        }

        return time;
    }
}

class Main {
    public static void main(String[] args) {
        Solution T = new Solution();
        int answer1 = T.solution(2, 10, new int[]{7, 4, 5, 6});
        System.out.println(answer1);
//        int answer2 = T.solution(100, 100, new int[]{10});
//        System.out.println(answer2);
    }
}