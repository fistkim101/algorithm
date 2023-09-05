package 해쉬트리셋.hash5;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCount = scanner.nextInt();
        int targetIndex = scanner.nextInt();
        int[] array = new int[totalCount];
        for (int i = 0; i < totalCount; i++) {
            array[i] = scanner.nextInt();
        }

        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < totalCount; i++) {
            for (int j = i + 1; j < totalCount; j++) {
                for (int k = j + 1; k < totalCount; k++) {
                    tSet.add(array[i] + array[j] + array[k]);
                }
            }
        }

        int count = 0;
        for (int sum : tSet) {
            count++;
            if (count == targetIndex) {
                System.out.println(sum);
            }
        }

        if (count < targetIndex) {
            System.out.println("-1");
        }
    }
}
