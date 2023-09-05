package 해쉬트리셋.hash2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();

        Map<Character, Integer> targetMap = new HashMap<>();
        for (char c : first.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        for (char c : second.toCharArray()) {
            if (!targetMap.containsKey(c) || targetMap.get(c) == 0) {
                System.out.println("NO");
                return;
            }

            targetMap.put(c, targetMap.get(c) - 1);
        }

        System.out.println("YES");
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String first = scanner.next();
//        String second = scanner.next();
//
//        Map<Character, Integer> firstMap = convertToMap(first);
//        Map<Character, Integer> secondMap = convertToMap(second);
//
//        boolean isSame = true;
//        for (Map.Entry<Character, Integer> entry : firstMap.entrySet()) {
//            if (!secondMap.containsKey(entry.getKey()) || !Objects.equals(secondMap.get(entry.getKey()), entry.getValue())) {
//                isSame = false;
//                break;
//            }
//        }
//
//        if (isSame) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//
//
//    private static Map<Character, Integer> convertToMap(String str) {
//        Map<Character, Integer> converted = new HashMap<>();
//        for (char c : str.toCharArray()) {
//            converted.put(c, converted.getOrDefault(c, 0) + 1);
//        }
//
//        return converted;
//    }
}
