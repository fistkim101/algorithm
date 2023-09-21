package 정렬.main6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] arr = new int[count];
        int[] tempArr = new int[count];
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            arr[i] = number;
            tempArr[i] = number;
        }
        Arrays.sort(tempArr);

        for (int i = 0; i < count; i++) {
            if (arr[i] != tempArr[i]) {
                System.out.print(i + 1 + " ");
            }
        }
    }
}
