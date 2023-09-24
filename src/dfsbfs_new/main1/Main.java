package dfsbfs_new.main1;

import java.util.Scanner;

public class Main {
    static int[] numbers;
    static int total = 0;
    static boolean stopNow = false;

    static String answer = "NO";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        numbers = new int[count];
        for (int i = 0; i < count; i++) {
            int value = scanner.nextInt();
            numbers[i] = value;
            total += value;
        }

        Main main = new Main();
        main.DFS(0, 0);
        System.out.println(answer);
    }

    private void DFS(int L, int sum) {
        if (sum > total - sum || stopNow) return;


        if (L == numbers.length - 1) {
            if (total - sum == sum) {
                answer = "YES";
                stopNow = true;
                return;
            }
        } else {
            DFS(L + 1, sum + numbers[L]);
            DFS(L + 1, sum);
        }

    }
}
