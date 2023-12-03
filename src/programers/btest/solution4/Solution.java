package programers.btest.solution4;

public class Solution {
    String[][] BOARD;
    int[][] VISITED;
    String WORD;

    public boolean solution(String[][] board, String word) {
        BOARD = board;
        WORD = word;
        int rowCount = board.length;
        int columnCount = board[0].length;
        VISITED = new int[rowCount][columnCount];

        for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
            for (int columnIndex = 0; columnIndex < columnCount; columnIndex++) {
                if (dfs(rowIndex, columnIndex, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(int rowIndex, int columnIndex, int depth) {
        // already visited
        if (VISITED[rowIndex][columnIndex] == 1) {
            return false;
        }

        if (depth == WORD.length()) {
            return true;
        }

        // out of edge
        if (rowIndex < 0 || columnIndex < 0 || rowIndex >= BOARD.length || columnIndex >= BOARD[0].length) {
            return false;
        }

        // incorrect
        if (!BOARD[rowIndex][columnIndex].equals(String.valueOf(WORD.charAt(depth)))) {
            return false;
        }

        VISITED[rowIndex][columnIndex] = 1;
        boolean permitted = dfs(rowIndex - 1, columnIndex, depth + 1) || // left
                dfs(rowIndex, columnIndex + 1, depth + 1) || // top
                dfs(rowIndex + 1, columnIndex, depth + 1) || // right
                dfs(rowIndex, columnIndex - 1, depth + 1); // bottom
        VISITED[rowIndex][columnIndex] = 0;

        return permitted;
    }
}

class Main {
    public static void main(String[] args) {
        Solution T = new Solution();
        String[][] board = {{"O", "A", "C", "D", "E", "O"},
                {"H", "O", "T", "C", "A", "P"},
                {"P", "U", "S", "E", "T", "Z"}};
        String word = "OHOUSE";
        boolean answer = T.solution(board, word);
        System.out.println(answer);
    }
}
