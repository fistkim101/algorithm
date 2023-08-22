package string;

import java.util.Scanner;

public class StringMain9 {
    public void solution(String str) {
        String converted = str.replaceAll("[^0-9]", "");
        int result = Integer.parseInt(converted);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringMain9 T = new StringMain9();
        T.solution(str);
    }
}
