package programers.stack.solution4;

import java.util.LinkedList;
import java.util.Queue;

class Process {
    int index;
    int priority;

    public Process(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Process> processQueue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            Process process = new Process(i, priorities[i]);
            processQueue.offer(process);
        }

        Queue<Integer> finishedProcessIndexes = new LinkedList<>();
        while (!processQueue.isEmpty()) {
            Process picked = processQueue.poll();

            for (Process process : processQueue) {
                if (process.priority > picked.priority) {
                    processQueue.offer(picked);
                    picked = null;
                    break;
                }
            }

            if (picked != null) {
                finishedProcessIndexes.offer(picked.index);
            }
        }

        int answer = 1;
        while (!finishedProcessIndexes.isEmpty()) {
            if (location == finishedProcessIndexes.poll()) {
                return answer;
            }
            answer++;
        }

        return -1;
    }
}

class Main {
    public static void main(String[] args) {
        Solution T = new Solution();
//        int answer = T.solution(new int[]{2, 1, 3, 2}, 2); // 1
        int answer = T.solution(new int[]{1, 1, 9, 1, 1, 1}, 0); // 5
        System.out.println(answer);
    }
}