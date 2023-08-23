package string;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class StringMain6 {

    public void solution2(String str) {
        Set<Character> charsSet = new LinkedHashSet<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            charsSet.add(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        charsSet.forEach(stringBuilder::append);
        System.out.println(stringBuilder);
    }

    public void solution(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int originalIndex = i;
            int firstIndex = str.indexOf(str.charAt(i));
            if (originalIndex == firstIndex) {
                stringBuilder.append(str.charAt(i));
            }
        }

        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringMain6 T = new StringMain6();
        T.solution(str);
    }
}
