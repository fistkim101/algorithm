package 해쉬트리셋.hash3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDays = scanner.nextInt();
        int period = scanner.nextInt();
        int[] sales = new int[totalDays];
        for (int i = 0; i < totalDays; i++) {
            sales[i] = scanner.nextInt();
        }

        Map<Integer, Integer> kinds = new HashMap<>();
        for (int i = 0; i < period - 1; i++) {
            kinds.put(sales[i], kinds.getOrDefault(sales[i], 0) + 1);
        }

        int leftIndex = 0;
        StringBuilder result = new StringBuilder();
        for (int rightIndex = period - 1; rightIndex < totalDays; rightIndex++) {
            kinds.put(sales[rightIndex], kinds.getOrDefault(sales[rightIndex], 0) + 1);
            result.append(kinds.size()).append(" ");

            kinds.put(sales[leftIndex], kinds.get(sales[leftIndex]) - 1);
            if (kinds.get(sales[leftIndex]) == 0) {
                kinds.remove(sales[leftIndex]);
            }
            leftIndex++;
        }

        System.out.println(result);
    }
}
