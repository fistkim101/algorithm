package stack.main3;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matric = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matric[i][j] = scanner.nextInt();
            }
        }

        int m = scanner.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = scanner.nextInt();
        }

        int count = 0;
        Stack<Integer> stack = new Stack<>();
        for (int number : moves) {
            int column = number - 1;
            for (int rowNum = 0; rowNum < n; rowNum++) {
                if (matric[rowNum][column] != 0) {
                    int dollType = matric[rowNum][column];
                    matric[rowNum][column] = 0;

                    if (!stack.isEmpty() && stack.peek() == dollType) {
                        count += 2;
                        stack.pop();
                    } else {
                        stack.push(dollType);
                    }
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
