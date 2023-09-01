package array.array3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] aStrategy = new int[count];
        for (int i = 0; i < count; i++) {
            aStrategy[i] = scanner.nextInt();
        }

        int[] bStrategy = new int[count];
        for (int i = 0; i < count; i++) {
            bStrategy[i] = scanner.nextInt();
        }

        for (int i = 0; i < count; i++) {
            printResult(aStrategy[i], bStrategy[i]);
        }
    }

    private static void printResult(int aStrategy, int bStrategy) {
        if (aStrategy == bStrategy) {
            System.out.println("D");
        } else if ((aStrategy == 1 && bStrategy == 3) || (aStrategy == 2 && bStrategy == 1) || (aStrategy == 3 && bStrategy == 2)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }

}
