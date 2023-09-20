package 정렬.main1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < count; i++) {
            int minIndex = i;
            for (int j = i + 1; j < count; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
