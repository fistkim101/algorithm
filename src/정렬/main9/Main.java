package 정렬.main9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        int answer = 0;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(mid, arr) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        System.out.println(answer);
    }

    private static int count(int midValue, int[] arr) {
        int sum = 0;
        int count = 1;
        for (int i : arr) {
            if (sum + i > midValue) {
                count++;
                sum = i;
            } else {
                sum += i;
            }
        }

        return count;
    }

}
