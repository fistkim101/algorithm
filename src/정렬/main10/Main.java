package 정렬.main10;

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

        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n - 1];
        int answer = 0;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) >= m) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        System.out.println(answer);
    }

    private static int count(int[] arr, int distance) {
        int count = 1;
        int point = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - point >= distance) {
                count++;
                point = arr[i];
            }
        }

        return count;
    }
}
