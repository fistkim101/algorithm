package programers.heap.solution1;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] scoville, int K) {
        Queue<Integer> priorityQ = new PriorityQueue<>();
        for (int s : scoville) {
            priorityQ.offer(s);
        }

        int answer = 0;
        while (priorityQ.peek() < K) {
            if (priorityQ.size() < 2) {
                return -1;
            }

            answer++;
            int first = priorityQ.poll();
            int second = priorityQ.poll();
            int result = first + (second * 2);
            priorityQ.offer(result);
        }

        return answer;
    }
}

class Main {
    public static void main(String[] args) {
        Solution T = new Solution();
        int answer = T.solution(new int[]{1, 2, 3, 9, 10, 12}, 7);
        System.out.println(answer);
    }
}