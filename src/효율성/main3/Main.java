package 효율성.main3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDays = scanner.nextInt();
        int targetDays = scanner.nextInt();

        int[] sales = new int[totalDays];
        for (int i = 0; i < totalDays; i++) {
            sales[i] = scanner.nextInt();
        }

        // initialize sum
        int sum = 0;
        for (int i = 0; i < targetDays; i++) {
            sum += sales[i];
        }

        int max = sum;
        for (int i = targetDays; i <= totalDays - targetDays; i++) {
            int newElement = sales[i];
            int deleteTargetElement = sales[i - targetDays];
            sum = sum + newElement - deleteTargetElement;
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
