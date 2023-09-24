package dfsbfs.main5;

import java.util.Scanner;

public class Main {

    static int count;
    static int[] coins;
    static int target;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        coins = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            coins[i] = scanner.nextInt();
        }
        target = scanner.nextInt();

        Main main = new Main();
        main.DFS(0, 0);
        System.out.println(min);
    }

    private void DFS(int L, int sum) {
        if (sum > target || L > min) {
            return;
        }

        if (sum == target) {
            min = Math.min(min, L);
            return;
        } else {
            for (int i = 0; i < count; i++) {
                DFS(L + 1, sum + coins[i]);
            }
        }
    }
}
