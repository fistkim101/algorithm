package 재귀.main3;

import java.util.Scanner;

public class Main {
    private static int recursive(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * recursive(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = recursive(n);
        System.out.println(result);
    }
}
