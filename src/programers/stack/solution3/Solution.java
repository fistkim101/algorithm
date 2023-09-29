package programers.stack.solution3;

import java.util.LinkedList;
import java.util.Queue;

class Task {
    int progress;
    int speed;

    public Task(int progress, int speed) {
        this.progress = progress;
        this.speed = speed;
    }

    public void doTask() {
        progress += speed;
    }
}

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Task> taskQueue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            Task task = new Task(progresses[i], speeds[i]);
            taskQueue.offer(task);
        }

        Queue<Integer> answerQueue = new LinkedList<>();
        while (!taskQueue.isEmpty()) {
            int tempAnswer = 0;
            while (!taskQueue.isEmpty() && taskQueue.peek().progress >= 100) {
                tempAnswer++;
                taskQueue.poll();
            }
            if (tempAnswer != 0) {
                answerQueue.offer(tempAnswer);
            }

            for (Task task : taskQueue) {
                task.doTask();
            }
        }

        int[] answer = new int[answerQueue.size()];
        for (int i = 0; i < answer.length; i++) {
            if (!answerQueue.isEmpty()) {
                answer[i] = answerQueue.poll();
            }
        }

        return answer;
    }
}

class Main {
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] answer = T.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        for (int n : answer) {
            System.out.print(n + " ");
        }
    }
}