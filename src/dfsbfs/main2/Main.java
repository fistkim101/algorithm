package dfsbfs.main2;

import java.util.Scanner;

public class Main {

    static int max = 0;
    static int limit = 0;
    static int[] weights;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        limit = scanner.nextInt();
        int count = scanner.nextInt();
        weights = new int[count];
        for (int i = 0; i < count; i++) {
            weights[i] = scanner.nextInt();
        }

        Main main = new Main();
        main.DFS(0, 0);

        System.out.println(max);
    }

    private void DFS(int index, int sum) {
        if (sum > limit) {
            return;
        }

        if (index == weights.length) {
            max = Math.max(sum, max);
        } else {
            DFS(index + 1, sum + weights[index]);
            DFS(index + 1, sum);
        }
    }
}
