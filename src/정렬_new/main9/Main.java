package 정렬_new.main9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int limitCount = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        int answer = 0;
        while (lt <= rt) {
            int midValue = (lt + rt) / 2;

            if (count(arr, midValue) <= limitCount) {
                answer = midValue;
                rt = midValue - 1;
            } else {
                lt = midValue + 1;
            }
        }

        System.out.println(answer);
    }

    private static int count(int[] arr, int capacity) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > capacity) {
                count++;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }

        return count;
    }
}
