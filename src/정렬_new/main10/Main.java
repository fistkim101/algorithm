package 정렬_new.main10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int horseCount = scanner.nextInt();
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

            if (count(arr, mid) >= horseCount) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        System.out.println(answer);
    }

    private static int count(int[] arr, int gap) {
        int horseCount = 1;
        int currentGap = 0;
        for (int i = 1; i < arr.length; i++) {
            currentGap += arr[i] - arr[i - 1];
            if (currentGap >= gap) {
                horseCount++;
                currentGap = 0;
            }
        }

        return horseCount;
    }
}
