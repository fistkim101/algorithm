package dfsbfs_new.main2;

import java.util.Scanner;

public class Main {
    static int limit;
    static int[] dogs;

    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        limit = scanner.nextInt();
        dogs = new int[scanner.nextInt()];
        for (int w = 0; w < dogs.length; w++) {
            dogs[w] = scanner.nextInt();
        }
        Main main = new Main();
        main.DFS(0, 0);
        System.out.println(max);
    }

    private void DFS(int L, int sum) {
        if (sum > limit) return;

        if (L == dogs.length) {
            max = Math.max(max, sum);
            return;
        } else {
            DFS(L + 1, sum + dogs[L]);
            DFS(L + 1, sum);
        }
    }
}
