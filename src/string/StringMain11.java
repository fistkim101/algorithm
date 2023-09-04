package string;

import java.util.Scanner;

public class StringMain11 {

    public void solution2(String originalString) {
        String appendedEmptyString = originalString + " ";
        char[] chars = appendedEmptyString.toCharArray();
        int count = 1;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < chars.length - 1; i++) {
            char currentChar = chars[i];
            char nextChar = chars[i + 1];
            if (currentChar == nextChar) {
                count++;
            } else {
                if (count != 1) {
                    result.append(currentChar).append(count);
//                    count = 1;
                } else {
                    result.append(currentChar);
                }
                count = 1;
            }
        }

        System.out.println(result);
    }

    public void solution(String str) {
        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(chars[0]);
        int count = 1;

        char lastChar = chars[0];
        for (int i = 1; i < chars.length; i++) {
            char currentChar = chars[i];
            if (lastChar == currentChar) {
                count++;
            } else {
                if (count != 1) {
                    stringBuilder.append(count);
                    count = 1;
                }

                stringBuilder.append(currentChar);
                lastChar = currentChar;
            }

            if (i == chars.length - 1) {
                if (count != 1) {
                    stringBuilder.append(count);
                }
            }
        }

        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringMain11 T = new StringMain11();
        T.solution2(str);
    }

}
