package programers.stack.solution1;

import java.util.Stack;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int number : arr) {
            if (stack.isEmpty() || stack.peek() != number) {
                stack.add(number);
            }
        }

        int[] anwser = new int[stack.size()];
        for (int i = anwser.length - 1; i >= 0; i--) {
            anwser[i] = stack.pop();
        }

        return anwser;
    }
}

class Main {
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] answer = T.solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        for (int a : answer) {
            System.out.println(a);
        }
    }
}