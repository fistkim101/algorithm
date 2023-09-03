package 효율성.main4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCount = scanner.nextInt();
        int targetValue = scanner.nextInt();

        int[] array = new int[totalCount];
        for (int i = 0; i < totalCount; i++) {
            array[i] = scanner.nextInt();
        }

        int count = 0;
        int leftIndex = 0;
        int sum = 0;
        for (int rightIndex = 0; rightIndex < totalCount; rightIndex++) {
            sum += array[rightIndex];
            if (sum == targetValue) count++;
            while (sum >= targetValue) {
                sum -= array[leftIndex];
                leftIndex++;
                if (sum == targetValue) count++;
            }
        }
        System.out.println(count);
    }
}
