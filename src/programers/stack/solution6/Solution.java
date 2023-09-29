package programers.stack.solution6;

class Solution {
    public int[] solution(int[] prices) {
        int[] answers = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int current = prices[i];

            int seconds = 0;
            for (int j = i + 1; j < prices.length; j++) {
                seconds++;
                if (prices[j] < current) {
                    break;
                }
            }

            answers[i] = seconds;
        }

        return answers;
    }
}