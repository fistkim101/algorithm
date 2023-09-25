package dfsbfs.main12;

import java.util.Scanner;

public class Main {
    static int answer = 0;
    static int n;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[][] board;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
        Main main = new Main();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    main.DFS(i, j);
                }
            }
        }
        System.out.println(answer);
    }

    private void DFS(int x, int y) {
        for (int i = 0; i < 8; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n && board[nextX][nextY] == 1) {
                board[nextX][nextY] = 0;
                DFS(nextX, nextY);
            }
        }
    }
}
