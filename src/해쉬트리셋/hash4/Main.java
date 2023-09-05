package 해쉬트리셋.hash4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();

        Map<Character, Integer> targetMap = new HashMap<>();
        for (char c : second.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        char[] firstArray = first.toCharArray();
        Map<Character, Integer> loopMap = new HashMap<>();
        for (int i = 0; i < second.length() - 1; i++) {
            loopMap.put(firstArray[i], loopMap.getOrDefault(firstArray[i], 0) + 1);
        }

        int leftIndex = 0;
        int count = 0;
        for (int rightIndex = second.length() - 1; rightIndex < first.length(); rightIndex++) {
            loopMap.put(firstArray[rightIndex], loopMap.getOrDefault(firstArray[rightIndex], 0) + 1);
            if (loopMap.equals(targetMap)) count++;

            loopMap.put(firstArray[leftIndex], loopMap.get(firstArray[leftIndex]) - 1);
            if (loopMap.get(firstArray[leftIndex]) == 0) {
                loopMap.remove(firstArray[leftIndex]);
            }
            leftIndex++;
        }

        System.out.println(count);
    }
}
