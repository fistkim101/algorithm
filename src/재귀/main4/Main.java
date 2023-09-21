package 재귀.main4;

import java.util.Scanner;

public class Main {
    static int[] fibo;

    private static int recursive(int n) {
        if (n == 1 || n == 2) {
            fibo[n] = 1;
            return 1;
        } else {
            if (fibo[n] != 0) {
                return fibo[n];
            } else {
                fibo[n] = recursive(n - 1) + recursive(n - 2);
                return fibo[n];
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fibo = new int[n + 1];
        recursive(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
