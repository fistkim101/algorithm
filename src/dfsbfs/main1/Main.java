package dfsbfs.main1;

import java.util.Scanner;

public class Main {
    static int[] arr;
    static int total = 0;

    static String answer = "NO";

    static boolean stopNow = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            total += arr[i];
        }

        Main main = new Main();
        main.DFS(0, 0);
        System.out.println(answer);
    }

    private void DFS(int index, int sum) {
        if (sum > total / 2 || stopNow) {
            return;
        }

        if (index == arr.length - 1) {
            if (sum == total - sum) {
                answer = "YES";
                stopNow = true;
            }
        } else {
            DFS(index + 1, sum + arr[index]);
            DFS(index + 1, sum);
        }
    }
}
