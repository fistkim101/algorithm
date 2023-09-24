package dfsbfs_new.main3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Problem {
    int point;
    int time;

    public Problem(int point, int time) {
        this.point = point;
        this.time = time;
    }
}

public class Main {
    static int timeLimit;
    static int timeSum;
    static int maxPoint = Integer.MIN_VALUE;
    static final List<Problem> problems = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        timeLimit = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            problems.add(new Problem(scanner.nextInt(), scanner.nextInt()));
        }

        Main main = new Main();
        main.DFS(0, 0, 0);
        System.out.println(maxPoint);
    }

    private void DFS(int L, int pointSum, int timeSum) {
        if (timeSum > timeLimit) return;

        if (L == problems.size()) {
            maxPoint = Math.max(maxPoint, pointSum);
        } else {
            DFS(L + 1, pointSum + problems.get(L).point, timeSum + problems.get(L).time);
            DFS(L + 1, pointSum, timeSum);
        }
    }
}







