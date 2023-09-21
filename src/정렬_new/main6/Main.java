package 정렬_new.main6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] correctOrder = new int[n];
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            arr[i] = value;
            correctOrder[i] = value;
        }

        Arrays.sort(correctOrder);
        for (int i = 0; i < n; i++) {
            if (arr[i] != correctOrder[i]) {
                System.out.print(i + 1 + " ");
            }
        }
    }
}
