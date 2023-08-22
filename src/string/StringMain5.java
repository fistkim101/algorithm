package string;

import java.util.Scanner;

public class StringMain5 {
    public void solution(String str) {
        char[] chars = str.toCharArray();
        int leftIndex = 0;
        int rightIndex = chars.length - 1;
        while (leftIndex < rightIndex) {
            if (!Character.isAlphabetic(chars[leftIndex])) {
                leftIndex++;
                continue;
            }

            if (!Character.isAlphabetic(chars[rightIndex])) {
                rightIndex--;
                continue;
            }

            char temp = chars[leftIndex];
            chars[leftIndex] = chars[rightIndex];
            chars[rightIndex] = temp;
            leftIndex++;
            rightIndex--;

        }
        System.out.println(chars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        StringMain5 T = new StringMain5();
        T.solution(string);
    }
}
