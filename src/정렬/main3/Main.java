package 정렬.main3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 1; i < count; i++) {
            int temp = numbers[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (temp < numbers[j]) {
                    numbers[j + 1] = numbers[j];
                } else {
                    break;
                }
            }
            numbers[j + 1] = temp;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
