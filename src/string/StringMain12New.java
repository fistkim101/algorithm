package string;

import java.util.Scanner;

public class StringMain12New {

    public void solution(int count, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            String binary = str.substring(0, 7).replace("#", "1").replace("*", "0");
            int code = Integer.parseInt(binary, 2);
            String targetChar = String.valueOf((char) code);
            stringBuilder.append(targetChar);
            str = str.substring(7);
        }
        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String string = scanner.next();
        StringMain12New T = new StringMain12New();
        T.solution(count, string);
    }
}
