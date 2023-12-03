package programers.search.solution5;

class Solution {
    public int solution(int k, int[][] dungeons) {
        int[] visited = new int[dungeons.length];
        explore(dungeons, visited, k, 0);

        return max;
    }

    private int max = 0;

    private void explore(int[][] dungeons, int[] visited, int k, int count) {
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i] == 0 && k >= dungeons[i][0]) {
                visited[i] = 1;
                explore(dungeons, visited, k - dungeons[i][1], count + 1);
                visited[i] = 0;
            }
        }

        if (max < count) {
            max = count;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Solution T = new Solution();
        int answer = T.solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}});
        System.out.println(answer);
    }
}