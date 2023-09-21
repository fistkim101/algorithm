package stack_new.main3;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int frameSize = scanner.nextInt();
        int[][] frame = new int[frameSize][frameSize];
        for (int i = 0; i < frameSize; i++) {
            for (int j = 0; j < frameSize; j++) {
                frame[i][j] = scanner.nextInt();
            }
        }

        int moveSize = scanner.nextInt();
        int[] moves = new int[moveSize];
        for (int i = 0; i < moveSize; i++) {
            moves[i] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (Integer c : moves) {
            int columnNumber = c - 1;

            for (int rowNumber = 0; rowNumber < frameSize; rowNumber++) {
                int current = frame[rowNumber][columnNumber];
                if (current != 0) {
                    if (!stack.isEmpty() && stack.peek() == current) {
                        stack.pop();
                        count += 2;
                    } else {
                        stack.add(current);
                    }
                    frame[rowNumber][columnNumber] = 0;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
