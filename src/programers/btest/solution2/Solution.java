package programers.btest.solution2;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int[] solution(int[] numbers) {
        Stack<Integer> result = new Stack<>();
        int lastNumber = numbers[numbers.length - 1];
        int temp = lastNumber + 1;
        int addValue = 0;
        if (temp == 10) {
            addValue = 1;
            result.add(0);
        } else {
            result.add(temp);
        }

        if (numbers.length == 1 && addValue == 1) {
            return new int[]{1, 0};
        }

        if (Arrays.stream(numbers).allMatch(e -> e == 9)) {
            int[] answer = new int[numbers.length + 1];
            answer[0] = 1;
            for (int i = 1; i < answer.length; i++) {
                answer[i] = 0;
            }
            return answer;
        }

        for (int i = numbers.length - 2; i >= 0; i--) {
            int element = numbers[i] + addValue;
            if (element < 10) {
                addValue = 0;
                result.add(element);
            } else {
                addValue = 1;
                result.add(0);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.pop();
        }

        return answer;
    }

}

class Main {
    public static void main(String[] args) {
        Solution T = new Solution();
//        int[] answer = T.solution(new int[]{2, 2, 0, 3}); // expect : 2, 2, 0, 4
        int[] answer = T.solution(new int[]{9, 9, 9}); // expect :  2, 0
        for (int num : answer) {
            System.out.print(num + " ");
        }
    }
}