package dfsbfs.main6;

import java.util.Scanner;

public class Main {
    static int totalCount;
    static int selectCount;
    static int[] numbers;
    static int[] pm;
    static int[] check;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        totalCount = scanner.nextInt();
        selectCount = scanner.nextInt();
        numbers = new int[totalCount];
        for (int i = 0; i < totalCount; i++) {
            numbers[i] = scanner.nextInt();
        }
        pm = new int[selectCount];
        check = new int[totalCount];
        Main main = new Main();
        main.DFS(0);
    }

    private void DFS(int L) {
        if (L > selectCount) return;

        if (L == selectCount) {
            for (int number : pm) System.out.print(number + " ");
            System.out.println();
        } else {
            for (int i = 0; i < totalCount; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    pm[L] = numbers[i];
                    DFS(L + 1);
                    check[i] = 0;
                }

            }
        }

    }
}
