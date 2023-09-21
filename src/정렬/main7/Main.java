package 정렬.main7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            return this.y - o.y;
        } else {
            return this.x - o.x;
        }
    }

    public void print() {
        System.out.print(this.x + " " + this.y);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            points.add(new Point(scanner.nextInt(), scanner.nextInt()));
        }

        Collections.sort(points);
        for (Point target : points) {
            target.print();
        }
    }
}
