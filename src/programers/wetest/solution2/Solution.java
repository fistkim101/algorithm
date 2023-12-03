package programers.wetest.solution2;

public class Solution {
    public int solution(int n) {
        int index = 0;
        for (int i = 1; i <= n; i++) {
            String number = String.valueOf(i);
            index += number.length();

            if (index < n) {
                continue;
            }

            return Integer.parseInt(String.valueOf(number.charAt(number.length() - (index - n) - 1)));
        }

        return 0;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(15));
    }
}
// temp
// first feature !!!
// master update