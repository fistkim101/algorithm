package 정렬.main5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < count; i++) {
            set.add(numbers[i]);
        }

        if (set.size() == count) {
            System.out.println("U");
        } else {
            System.out.println("D");
        }

    }
}
