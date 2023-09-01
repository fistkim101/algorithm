package array.array5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int[] array = new int[limit + 1];

        int result = 0;
        for (int i = 2; i <= limit; i++) {
            if (array[i] == 0) {
                result++;
                for (int j = i; j <= limit; j = j + i) {
                    array[j] = 1;
                }
            }
        }

        System.out.println(result);
    }
}
