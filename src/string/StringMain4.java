package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMain4 {

    public void solution2(List<String> strings) {
        for (String str : strings) {
            StringBuilder stringBuilder = new StringBuilder(str);
            System.out.println(stringBuilder.reverse());
        }

        for (String str : strings) {
            int length = str.length();
            StringBuilder result = new StringBuilder();
            for (int i = length - 1; i >= 0; i--) {
                result.append(str.charAt(i));
            }
            System.out.println(result);
        }
    }

    public void solution(List<String> strings) {
        for (String str : strings) {
            char[] chars = str.toCharArray();
            int leftIndex = 0;
            int rightIndex = chars.length - 1;
            while (leftIndex < rightIndex) {
                char tmp = chars[leftIndex];
                chars[leftIndex] = chars[rightIndex];
                chars[rightIndex] = tmp;
                leftIndex++;
                rightIndex--;
            }
            System.out.println(chars);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String temp = scanner.next();
            strings.add(temp);
        }
        StringMain4 T = new StringMain4();
        T.solution(strings);
    }
}
