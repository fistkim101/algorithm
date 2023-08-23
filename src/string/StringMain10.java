package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMain10 {

    public void solution2(String string, String targetString) {
        char[] chars = string.toCharArray();
        char target = targetString.toCharArray()[0];

        int distance = chars.length;
        int[] distances = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != target) {
                distances[i] = distance;
            } else {
                distance = 0;
                distances[i] = distance;
            }
            distance++;
        }

        distance = chars.length;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != target) {
                int currentDistance = distances[i];
                int newDistance = distance;

                distances[i] = Math.min(currentDistance, newDistance);
//                if (currentDistance < newDistance) {
//                    distances[i] = currentDistance;
//                } else {
//                    distances[i] = newDistance;
//                }

            } else {
                distance = 0;
                distances[i] = distance;
            }
            distance++;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int d : distances) {
            stringBuilder.append(d).append(" ");
        }
        System.out.println(stringBuilder.toString().trim());
    }

    public void solution(String string, String target) {
        char[] chars = string.toCharArray();
        char targetChar = target.toCharArray()[0];

        final List<Integer> targetIndex = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == targetChar) {
                targetIndex.add(i);
            }
        }

        final List<Integer> distances = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            int min = chars.length - 1;
            for (Integer index : targetIndex) {
                int temp = 0;
                if (index > i) {
                    temp = index - i;
                } else {
                    temp = i - index;
                }

                if (temp < min) {
                    min = temp;
                }
            }
            distances.add(min);
        }

        StringBuilder stringBuilder = new StringBuilder();
        distances.forEach(distance -> {
            stringBuilder.append(distance).append(" ");
        });
        String result = stringBuilder.toString().trim();
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strings = string.split(" ");
        StringMain10 T = new StringMain10();
        T.solution2(strings[0], strings[1]);
    }
}
