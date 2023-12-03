package programers.wetest.solution1;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

class Time {
    LocalTime start;
    LocalTime end;

    public Time(String start, String end) {
        this.start = LocalTime.parse(start);
        this.end = LocalTime.parse(end);
    }

    public int calculate() {
        Duration gap = Duration.between(this.start, this.end);
        long minutes = gap.toMinutes();
        if (minutes < 5) {
            return 0;
        }

        if (minutes > 105) {
            return 105;
        }

        return (int) minutes;
    }
}

class Solution {
    public String solution(String[] log) {
        List<Time> times = new ArrayList<>();
        for (int i = 0; i < log.length; i = i + 2) {
            String start = log[i];
            String end = log[i + 1];
            times.add(new Time(start, end));
        }

        int totalMinutes = 0;
        for (Time time : times) {
            totalMinutes += time.calculate();
        }

        int hours = totalMinutes / 60;
        int remainingMinutes = totalMinutes % 60;

        return LocalTime.of(hours, remainingMinutes).toString();
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String answer = T.solution(new String[]{"08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"});
        System.out.println(answer);
    }
}
