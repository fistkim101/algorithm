package array.array1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int[] array = new int[target];
        for (int i = 0; i < target; i++) {
            array[i] = scanner.nextInt();
        }

        Main main = new Main();
        main.solution(target, array);
    }

    private void solution(int target, int[] array) {
        System.out.print(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                System.out.print(" " + array[i]);
            }
        }
    }

}
