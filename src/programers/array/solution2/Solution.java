package programers.array.solution2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Number implements Comparable<Number> {
    int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Number o) {
        String first = String.valueOf(this.value);
        String second = String.valueOf(o.value);

        int firstValue = Integer.parseInt(first + second);
        int secondValue = Integer.parseInt(second + first);

        return secondValue - firstValue;
    }
}

class Solution {
    public String solution(int[] numbers) {
        List<Number> targets = new ArrayList<>();
        for (int num : numbers) {
            targets.add(new Number(num));
        }
        Collections.sort(targets);

        if (targets.get(0).value == 0) {
            return "0";
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Number number : targets) {
            stringBuilder.append(number.value);
        }

        return stringBuilder.toString();
    }
}

class Main {
    public static void main(String[] args) {
        Solution T = new Solution();
//        String answer = T.solution(new int[]{6, 10, 2});
        String answer = T.solution(new int[]{3, 30, 34, 5, 9}); // 9534330
        System.out.println(answer);
    }
}