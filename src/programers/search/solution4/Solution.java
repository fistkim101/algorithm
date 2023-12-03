package programers.search.solution4;

class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        for (int i = 1; i <= Math.sqrt(total); i++) {
            if (total % i == 0) {
                int height = i;
                int weight = total / height;

                if ((weight - 2) * (height - 2) == yellow) {
                    return new int[]{weight, height};
                }
            }
        }

        int[] answer = {};
        return answer;
    }

}