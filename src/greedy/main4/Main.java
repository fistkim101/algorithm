package greedy.main4;

import java.util.*;

class Lecture implements Comparable<Lecture> {
    int money;
    int endTime;

    public Lecture(int money, int endTime) {
        this.money = money;
        this.endTime = endTime;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.endTime - this.endTime;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Lecture> lectures = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            Lecture lecture = new Lecture(scanner.nextInt(), scanner.nextInt());
            lectures.add(lecture);
            max = Math.max(max, lecture.endTime);
        }

        PriorityQueue<Integer> moneys = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(lectures);
        int j = 0;
        int moneySum = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if (lectures.get(j).endTime < i) {
                    break;
                } else {
                    moneys.offer(lectures.get(j).money);
                }
            }
            if (!moneys.isEmpty()) {
                moneySum += moneys.poll();
            }
        }

        System.out.println(moneySum);
    }
}
