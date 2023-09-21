package 재귀.main1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        recursive(scanner.nextInt());
    }

    public static void recursive(int n) {
        if (n == 0) {
            return;
        } else {
            recursive(n - 1);
            System.out.print(n + " ");
        }
    }
}
