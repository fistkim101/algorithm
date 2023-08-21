package string;

import java.util.Scanner;

public class StringMain1 {
    public int solution(String string, char t) {
        final String upperCaseString = string.toUpperCase();
        final char targetCharacter = Character.toUpperCase(t);
        int result = 0;
        for (char c : upperCaseString.toCharArray()) {
            if (c == targetCharacter) result++;
        }
        return result;
    }

    public static void main(String[] args) {
        StringMain1 T = new StringMain1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
