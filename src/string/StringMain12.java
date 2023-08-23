package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMain12 {

    public void solution(String str) {
        char[] chars = str.toCharArray();
        List<String> strings = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (stringBuilder.length() != 0 && stringBuilder.length() % 7 == 0) {
                strings.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
            }
            stringBuilder.append(chars[i]);

            if (i == chars.length - 1) {
                strings.add(stringBuilder.toString());
            }
        }

        StringBuilder result = new StringBuilder();
        strings.stream()
                .map(tmpStr -> {
                    tmpStr = tmpStr.replace("#", "1");
                    tmpStr = tmpStr.replace("*", "0");
                    return tmpStr;
                })
                .map(binary -> {
                    char[] binaries = binary.toCharArray();
                    int resultInt = 0;
                    for (int i = binaries.length - 1; i >= 0; i--) {
                        int target = Integer.parseInt(String.valueOf(binaries[i]));
                        double multiple = Math.pow(2, binaries.length - (i + 1));
                        resultInt += target * multiple;
                    }
                    return (char) resultInt;
                })
                .forEach(result::append);
        System.out.println(result);
    }

    private static char convertToString(String binary) {
        char[] chars = binary.toCharArray();
        int result = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            int target = Integer.parseInt(String.valueOf(chars[i]));
            double multiple = Math.pow(2, chars.length - (i + 1));
            result += target * multiple;
        }
        return (char) result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str = scanner.next();
        StringMain12 T = new StringMain12();
        T.solution(str);
    }
}
