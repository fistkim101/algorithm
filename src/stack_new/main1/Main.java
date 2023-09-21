package stack_new.main1;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Stack<Character> stack = new Stack<>();
        for (Character c : str.toCharArray()) {
            if (c == ')') {

                if (stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
            } else {
                stack.add(c);
            }
        }

        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
