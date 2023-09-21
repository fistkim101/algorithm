package 정렬_new.main4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cacheSize = scanner.nextInt();
        int[] cacheMemory = new int[cacheSize];

        int taskSize = scanner.nextInt();
        int[] tasks = new int[taskSize];
        for (int i = 0; i < taskSize; i++) {
            tasks[i] = scanner.nextInt();
        }

        for (int task : tasks) {
            int hitIndex = -1;
            for (int i = 0; i < cacheSize; i++) {
                if (cacheMemory[i] == task) {
                    hitIndex = i;
                    break;
                }
            }

            if (hitIndex == -1) {
                // cache miss
                for (int i = cacheSize - 1; i >= 1; i--) {
                    cacheMemory[i] = cacheMemory[i - 1];
                }
            } else {
                // cache hit
                for (int i = hitIndex; i >= 1; i--) {
                    cacheMemory[i] = cacheMemory[i - 1];
                }
            }
            cacheMemory[0] = task;
        }

        for (int task : cacheMemory) {
            System.out.print(task + " ");
        }
    }
}
