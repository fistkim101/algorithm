package dfsbfs.main7;

import java.util.Scanner;

public class Main {

    int[][] dy = new int[35][35];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();

        Main main = new Main();
        System.out.println(main.DFS(n, r));
    }

    private int DFS(int n, int r) {
        if (dy[n][r] != 0) return dy[n][r];

        if (n == r || r == 0) {
            return 1;
        } else {
            dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
            return dy[n][r];
        }
    }
}
