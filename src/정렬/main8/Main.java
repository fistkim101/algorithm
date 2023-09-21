package 정렬.main8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int target = scanner.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }

        int lt = 0;
        int rt = count - 1;
        int answer = 0;
        Arrays.sort(arr);
        while (lt <= rt) {
            int midIndex = (lt + rt) / 2;
            if (arr[midIndex] == target) {
                answer = midIndex + 1;
                break;
            }

            if (arr[midIndex] > target) {
                rt = midIndex - 1;
            } else {
                lt = midIndex + 1;
            }
        }

        System.out.println(answer);
    }
}
