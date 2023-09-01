package array.array10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[][] array = new int[count + 2][count + 2];
        for (int i = 1; i < count + 1; i++) {
            for (int j = 1; j < count + 1; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

//        for (int i = 0; i < count + 2; i++) {
//            for (int j = 0; j < count + 2; j++) {
//                if (i == 0) {
//                    array[i][j] = 0;
//                } else if (i == count + 1) {
//                    array[i][j] = 0;
//                } else if (j == 0 || j == count + 1) {
//                    array[i][j] = 0;
//                } else {
//                    array[i][j] = scanner.nextInt();
//                }
//            }
//        }

        int resultCount = 0;
        for (int i = 1; i < count + 1; i++) {
            for (int j = 1; j < count + 1; j++) {
                int targetNumber = array[i][j];

                int top = array[i - 1][j];
                int bottom = array[i + 1][j];
                int left = array[i][j - 1];
                int right = array[i][j + 1];

                if (top < targetNumber && bottom < targetNumber && left < targetNumber && right < targetNumber) {
                    resultCount++;
                }
            }
        }

        System.out.println(resultCount);
    }

}
