package stack.main4;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(Integer.parseInt(String.valueOf(c)));
            } else {
                int right = Integer.parseInt(String.valueOf(stack.pop()));
                int left = Integer.parseInt(String.valueOf(stack.pop()));
                int result = calculate(left, right, c);
                stack.push(result);
            }
        }

        System.out.println(stack.get(0));
    }

    private static int calculate(int left, int right, char cal) {
        if (cal == '*') {
            return left * right;
        } else if (cal == '/') {
            return left / right;
        } else if (cal == '+') {
            return left + right;
        } else {
            return left - right;
        }
    }
}
