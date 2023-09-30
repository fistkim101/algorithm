package programers.heap.solution2;

import java.util.*;

class Task implements Comparable<Task> {
    int requestTime;
    int takeTime;

    public Task(int requestTime, int takeTime) {
        this.requestTime = requestTime;
        this.takeTime = takeTime;
    }

    @Override
    public int compareTo(Task o) {
        return this.takeTime - o.takeTime;
    }
}

class Solution {
    public int solution(int[][] jobs) {
        List<Task> tasks = new ArrayList<>();
        for (int i = 0; i < jobs.length; i++) {
            Task task = new Task(jobs[i][0], jobs[i][1]);
            tasks.add(task);
        }
        tasks.sort(Comparator.comparingInt(t -> t.requestTime));

        int totalTime = 0;
        int endTime = 0;
        int index = 0;
        Queue<Task> priorityQueue = new PriorityQueue<>();
        while (index < tasks.size() || !priorityQueue.isEmpty()) {
            while (index < tasks.size() && tasks.get(index).requestTime <= endTime) {
                priorityQueue.offer(tasks.get(index++));
            }

            if (priorityQueue.isEmpty()) {
                endTime = tasks.get(index).requestTime;
            } else {
                Task currentTask = priorityQueue.poll();

                int waitingTime = endTime - currentTask.requestTime;
                int actualTime = waitingTime + currentTask.takeTime;
                totalTime += actualTime;
                endTime += currentTask.takeTime;
            }
        }

        return totalTime / jobs.length;
    }
}

class Main {
    public static void main(String[] args) {
        Solution T = new Solution();
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        int answer = T.solution(jobs);
        System.out.println(answer);
    }
}