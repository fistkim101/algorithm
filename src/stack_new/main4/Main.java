package stack_new.main4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mandatory = scanner.next();
        Queue<Character> mandatoryQueue = new LinkedList<>();
        for (Character c : mandatory.toCharArray()) {
            mandatoryQueue.offer(c);
        }

        String order = scanner.next();
        for (Character c : order.toCharArray()) {
            if (mandatoryQueue.contains(c)) {
                if (c != mandatoryQueue.poll()) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        if (mandatoryQueue.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
