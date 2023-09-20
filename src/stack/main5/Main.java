package stack.main5;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.toCharArray()[i];
            if (c == '(') {
                stack.push(c);
            } else {
                stack.pop();
                if (str.toCharArray()[i - 1] == '(') {
                    count += stack.size();
                } else {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
