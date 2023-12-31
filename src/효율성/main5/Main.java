package 효율성.main5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int limit = (n / 2) + 1;
        int[] arr = new int[limit];
        for (int i = 0; i < limit; i++) {
            arr[i] = i + 1;
        }

        int sum = 0;
        int count = 0;
        int lt = 0;
        for (int rt = 0; rt < limit; rt++) {
            sum += arr[rt];
            if (sum == n) {
                count++;
            }

            while (sum > n) {
                sum -= arr[lt];
                lt++;
                if (sum == n) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int targetValue = scanner.nextInt();
//        int[] array = new int[targetValue];
//        for (int i = 0; i < targetValue; i++) {
//            array[i] = i + 1;
//        }
//
//        int limit = (targetValue / 2) + 1;
//        int sum = 0;
//        int leftIndex = 0;
//        int count = 0;
//        for (int rightIndex = 0; rightIndex <= limit; rightIndex++) {
//            sum += array[rightIndex];
//            if (sum == targetValue) count++;
//            while (sum >= targetValue) {
//                sum -= array[leftIndex];
//                leftIndex++;
//                if (sum == targetValue) count++;
//            }
//        }
//
//        System.out.println(count);
//    }
}
