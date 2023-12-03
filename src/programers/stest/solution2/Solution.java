package programers.stest.solution2;

import java.util.*;

public class Solution {
    public int solution(int[] numbers, int k) {
        final List<int[]> permutations = this.getAllPermutations(numbers);
        final List<int[]> permittedPermutations = new ArrayList<>();
        for (int[] nums : permutations) {
            boolean isPermitted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                int big = Math.max(nums[i + 1], nums[i]);
                int small = Math.min(nums[i + 1], nums[i]);
                int gap = big - small;
                if (gap > k) {
                    isPermitted = false;
                    break;
                }
            }

            if (isPermitted) {
                permittedPermutations.add(nums);
            }
        }

        int minCount = Integer.MAX_VALUE;
        for (int[] permitted : permittedPermutations) {
            int count = getSwapCount(permitted, numbers);
            minCount = Math.min(minCount, count);
        }

        return minCount;
    }

    private int getSwapCount(int[] permitted, int[] numbers) {
        final Map<Integer, Integer> indexes = new HashMap<>();
        int swapCount = 0;

        for (int i = 0; i < permitted.length; i++) {
            indexes.put(permitted[i], i);
        }

        for (int i = 0; i < permitted.length; i++) {
            if (permitted[i] != numbers[i]) {
                int targetIndex = indexes.get(numbers[i]);

                int temp = permitted[i];
                permitted[i] = permitted[targetIndex];
                permitted[targetIndex] = temp;

                indexes.put(permitted[i], i);
                indexes.put(permitted[targetIndex], targetIndex);

                swapCount++;
            }
        }

        return swapCount;
    }

    private List<int[]> getAllPermutations(int[] numbers) {
        final List<int[]> permutations = new ArrayList<>();
        getPermutations(numbers, 0, permutations);
        return permutations;
    }

    private void getPermutations(int[] numbers, int depth, List<int[]> permutations) {
        if (depth == numbers.length - 1) {
            permutations.add(Arrays.copyOf(numbers, numbers.length));
            return;
        }

        for (int i = depth; i < numbers.length; i++) {
            swap(numbers, depth, i);
            getPermutations(numbers, depth + 1, permutations);
            swap(numbers, depth, i);
        }
    }

    private void swap(int[] numbers, int depth, int i) {
        int temp = numbers[depth];
        numbers[depth] = numbers[i];
        numbers[i] = temp;
    }

}

class Main {
    public static void main(String[] args) {
        Solution T = new Solution();
//        int answer = T.solution(new int[]{10, 40, 30, 20}, 20); // 1
        int answer = T.solution(new int[]{3, 7, 2, 8, 6, 4, 5, 1}, 3); // 2
        System.out.println(answer);
    }
}
