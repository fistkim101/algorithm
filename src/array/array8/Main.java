package array.array8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i : array) {
            System.out.print(getOrder(array, i) + " ");
        }

    }

    private static int getOrder(int[] array, int targetNumber) {
        int order = 1;

        for (int i : array) {
            if (i > targetNumber) {
                order++;
            }
        }

        return order;
    }

}
