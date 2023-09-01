package array.array9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int[][] row = new int[count][count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                row[i][j] = scanner.nextInt();
            }
        }

        int max = 0;

        // row, column
        for (int i = 0; i < count; i++) {
            int rowSum = 0;
            int columSum = 0;
            for (int j = 0; j < count; j++) {
                rowSum += row[i][j];
                columSum += row[j][i];
            }
            int tmpMax = Math.max(rowSum, columSum);
            max = Math.max(max, tmpMax);
        }

        int leftToRight = 0;
        for (int i = 0; i < count; i++) {
            leftToRight += row[i][i];
        }
        max = Math.max(max, leftToRight);

        // x > 00,11,22 | 02,11,20
        int rightToLeft = 0;
        for (int i = 0; i < count; i++) {
            rightToLeft += row[i][count - 1 - i];
        }
        max = Math.max(max, rightToLeft);


        System.out.println(max);
    }

}
