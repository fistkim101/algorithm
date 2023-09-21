package 정렬_new.main8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        int lt = 0;
        int rt = n - 1;
        int answer = 0;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            int midValue = arr[mid];

            if (midValue == target) {
                answer = mid + 1;
                break;
            }

            if (midValue > target) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        System.out.println(answer);
    }
}
