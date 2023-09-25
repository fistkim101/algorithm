package greedy.main2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Meeting implements Comparable<Meeting> {
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting o) {
        if (this.end != o.end) {
            return this.end - o.end;
        }

        return this.start - o.start;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        final List<Meeting> meetings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            meetings.add(new Meeting(scanner.nextInt(), scanner.nextInt()));
        }

        Collections.sort(meetings);
        int previousEnd = 0;
        int count = 0;
        for (Meeting m : meetings) {
            if (previousEnd <= m.start) {
                previousEnd = m.end;
                count++;
            }
        }
        System.out.println(count);
    }
}
