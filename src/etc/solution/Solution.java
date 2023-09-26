package etc.solution;

class Solution {
    public void solution(int N) {
        int enable_print = N % 10;
        while (N > 0) {
            if (N % 10 != 0) {
                enable_print = 1;
            }
            if (enable_print == 1) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Solution T = new Solution();
        T.solution(50);
    }
}