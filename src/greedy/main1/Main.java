package greedy.main1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Person implements Comparable<Person> {
    int height;
    int weight;

    public Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person o) {
        return o.height - this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        final List<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            persons.add(new Person(scanner.nextInt(), scanner.nextInt()));
        }
        Collections.sort(persons);
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (Person p : persons) {
            if (p.weight > max) {
                max = p.weight;
                count++;
            }
        }

        System.out.println(count);
    }
}
