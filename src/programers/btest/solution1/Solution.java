package programers.btest.solution1;

import java.util.Stack;

public class Solution {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char target : s.toCharArray()) {
            if ((target == '(') || (target == '{') || (target == '[')) {
                stack.push(target);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            char last = stack.pop();
            if (!isCorrectPair(last, target)) {
                return false;
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isCorrectPair(char last, char closer) {
        if (last == '(') {
            return closer == ')';
        }

        if (last == '{') {
            return closer == '}';
        }

        if (last == '[') {
            return closer == ']';
        }

        return false;
    }

}

class Main {
    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution("([]){}")); // true
        System.out.println(T.solution("[(]){}")); // false
    }
}