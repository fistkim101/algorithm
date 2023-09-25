package greedy.main3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Time implements Comparable<Time> {
    int value;
    Character type;

    public Time(int value, Character type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public int compareTo(Time o) {
        if (this.value == o.value) {
            return this.type - o.type;
        }
        return this.value - o.value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Time> times = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            times.add(new Time(start, 's'));
            times.add(new Time(end, 'e'));
        }
        Collections.sort(times);
        int count = 0;
        int max = 0;
        for (Time t : times) {
            if (t.type == 's') {
                count++;
            } else {
                count--;
            }

            max = Math.max(count, max);
        }

        System.out.println(max);
    }
}
