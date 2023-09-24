package dfsbfs.main3;

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
    static int count;
    static int limit;
    static int pointMax = 0;
    static List<Problem> problems = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        limit = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            problems.add(new Problem(scanner.nextInt(), scanner.nextInt()));
        }
        Main main = new Main();
        main.DFS(0, 0, 0);
        System.out.println(pointMax);
    }

    private void DFS(int index, int pointSum, int timeSum) {
        if (timeSum > limit) return;

        if (index == count) {
            pointMax = Math.max(pointSum, pointMax);
        } else {
            DFS(index + 1, pointSum + problems.get(index).point, timeSum + problems.get(index).time);
            DFS(index + 1, pointSum, timeSum);
        }
    }
}
