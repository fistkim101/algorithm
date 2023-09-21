package 정렬_new.main7;

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

    @Override
    public int compareTo(Point o) {
        Point target = (Point) o;
        if (this.x == target.x) {
            return this.y - target.y;
        } else {
            return this.x - target.x;
        }
    }

    public void print() {
        System.out.println(this.x + " " + this.y);
    }
}

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        final List<Point> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Point point = new Point(scanner.nextInt(), scanner.nextInt());
            points.add(point);
        }

        Collections.sort(points);
        for (Point p : points) {
            p.print();
        }
    }
}
