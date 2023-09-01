package array.array7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }

        int weight = 0;
        int sum = 0;
        for (int result : array) {
            if (result == 0) {
                weight = 0;
            } else {
                sum += 1 + weight;
                weight++;
            }
        }

        System.out.println(sum);
    }

}
