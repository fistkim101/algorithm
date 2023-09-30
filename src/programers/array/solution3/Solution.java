package programers.array.solution3;

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int max = 0;
        for (int i = 0; i < citations.length; i++) {
            int biggerSize = citations.length - i;
            int current = citations[i];
            if (current >= biggerSize) {
                max = Math.max(max, biggerSize);
            }
        }

        return max;
    }
}

class Main {
    public static void main(String[] args) {
        Solution T = new Solution();
        int answer = T.solution(new int[]{3, 0, 6, 1, 5}); // 3
        System.out.println(answer);
    }
}