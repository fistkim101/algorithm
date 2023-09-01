package array.array2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }

        int max = 0;
        int result = 0;
        for (int i : array) {
            if (i > max) {
                result++;
                max = i;
            }
        }

        System.out.println(result);
    }

}
