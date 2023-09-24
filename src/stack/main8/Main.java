package stack.main8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id;
    int value;

    public Person(int id, int value) {
        this.id = id;
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int order = scanner.nextInt();
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            queue.offer(new Person(i, scanner.nextInt()));
        }

        int asnwer = 1;
        while (!queue.isEmpty()) {
            Person current = queue.poll();

            for (Person p : queue) {
                if (p.value > current.value) {
                    queue.offer(current);
                    current = null;
                    break;
                }
            }

            if (current != null) {
                if (order == current.id) {
                    System.out.println(asnwer);
                    return;
                } else {
                    asnwer++;
                }
            }
        }

        System.out.println(asnwer);
    }
}
