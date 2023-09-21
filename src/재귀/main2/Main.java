package 재귀.main2;

import java.util.Scanner;

public class Main {
    private static void recursive(int n) {
        if (n == 0) {
            return;
        } else {
            recursive(n / 2);
            System.out.print(n % 2);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        recursive(n);
    }
}
