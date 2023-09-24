package dfsbfs_new.main5;

import java.util.Scanner;

public class Main {

    static int targetSum;
    static int[] coins;
    static int answer = Integer.MAX_VALUE;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        coins = new int[count];
        for (int i = 0; i < count; i++) {
            coins[i] = scanner.nextInt();
        }
        targetSum = scanner.nextInt();

        Main main = new Main();
        main.DFS(0, 0);
        System.out.println(answer);
    }

    private void DFS(int L, int sum) {
        if (sum > targetSum || L > answer) return;

        if (sum == targetSum) {
            answer = Math.min(answer, L);
            return;
        } else {
            for (int i = coins.length - 1; i >= 0; i--) {
                DFS(L + 1, sum + coins[i]);
            }
        }
    }
}
