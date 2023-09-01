package array.array4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];
        array[0] = 1;
        array[1] = 1;
        System.out.print(1 + " " + 1);
        for (int i = 2; i < count; i++) {
            array[i] = array[i - 2] + array[i - 1];
            System.out.print(" " + array[i]);
        }
    }

}
