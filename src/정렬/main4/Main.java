package 정렬.main4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] cache = new int[size];

        int count = scanner.nextInt();
        int[] tasks = new int[count];
        for (int i = 0; i < count; i++) {
            tasks[i] = scanner.nextInt();
        }

        for (int task : tasks) {
            int targetIndex = -1;

            for (int i = 0; i < size; i++) {
                if (task == cache[i]) {
                    targetIndex = i;
                }
            }

            if (targetIndex == -1) {
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                for (int i = targetIndex; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = task;
        }


        for (int number : cache) {
            System.out.print(number + " ");
        }
    }
}
