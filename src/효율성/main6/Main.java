package 효율성.main6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int permitCount = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }

        int zeroCount = 0;
        int max = 0;
        int leftIndex = 0;
        for (int rightIndex = 0; rightIndex < count; rightIndex++) {
            if (array[rightIndex] == 0) {
                zeroCount++;
            }

            if (zeroCount <= permitCount) {
                max = Math.max(max, rightIndex - leftIndex + 1);
            }

            while (zeroCount > permitCount) {
                if (array[leftIndex] == 0) {
                    zeroCount--;
                }
                leftIndex++;

                if (zeroCount <= permitCount) {
                    max = Math.max(max, rightIndex - leftIndex + 1);
                }
            }
        }

        System.out.println(max);
    }
}
