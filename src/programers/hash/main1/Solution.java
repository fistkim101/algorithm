package programers.hash.main1;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int selectCount = (nums.length / 2);
        Set<Integer> monsters = new HashSet<>();
        for (int monster : nums) {
            monsters.add(monster);
        }

        if (selectCount <= monsters.size()) {
            return selectCount;
        } else {
            return monsters.size();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = new int[]{3, 1, 2, 3}; // 2
//        int[] nums = new int[]{3,3,3,2,2,4}; // 3
        int[] nums = new int[]{3, 3, 3, 2, 2, 2}; // 2
        System.out.println(solution.solution(nums));
    }
}