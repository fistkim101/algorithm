package programers.search.solution1;

class Solution {
    public int solution(int[][] sizes) {
        int maxLong = 0;
        int maxShort = 0;

        for (int[] size : sizes) {
            int tempMax = Math.max(size[0], size[1]);
            int tempMin = Math.min(size[0], size[1]);

            maxLong = Math.max(maxLong, tempMax);
            maxShort = Math.max(maxShort, tempMin);
        }

        return maxLong * maxShort;
    }
}
