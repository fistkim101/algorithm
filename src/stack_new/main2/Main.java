package stack_new.main2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Stack<Character> stack = new Stack<>();
        for (Character c : str.toCharArray()) {
            if (c == ')') {
                while ('(' != stack.pop()) {
                }
            } else {
                stack.add(c);
            }
        }

        stack.stream().forEach(System.out::print);
    }
}
