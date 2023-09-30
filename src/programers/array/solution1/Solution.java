package programers.array.solution1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int startIndex = commands[i][0] - 1;
            int endIndex = commands[i][1] - 1;
            int targetIndex = commands[i][2] - 1;
            int[] scopedArray = getScopedArray(array, startIndex, endIndex);
            Arrays.sort(scopedArray);
            answer[i] = scopedArray[targetIndex];
        }

        return answer;
    }

    private int[] getScopedArray(int[] array, int startIndex, int endIndex) {
        List<Integer> temp = new ArrayList<>();
        for (int i = startIndex; i <= endIndex; i++) {
            temp.add(array[i]);
        }

        int[] result = new int[temp.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp.get(i);
        }

        return result;
    }
}

class Main {
    public static void main(String[] args) {
        Solution T = new Solution();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = T.solution(array, commands);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}