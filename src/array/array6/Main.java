package array.array6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }

        for (int number : array) {
            int reversedNumber = Integer.parseInt((new StringBuilder(String.valueOf(number)).reverse()).toString());
            if (isPrimeNumber(reversedNumber)) {
                System.out.print(reversedNumber + " ");
            }
        }
    }

    private static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }

        boolean result = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return result;
    }

}
