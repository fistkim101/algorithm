package greedy.main6;

import java.util.Scanner;

public class Main {
    static int[] groups;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int memberCount = scanner.nextInt();
        int pairCount = scanner.nextInt();
        groups = new int[memberCount + 1];
        for (int i = 1; i <= memberCount; i++) {
            groups[i] = i;
        }
        for (int i = 0; i < pairCount; i++) {
            int firstMember = scanner.nextInt();
            int secondMember = scanner.nextInt();
            Union(firstMember, secondMember);
        }

        int target1 = scanner.nextInt();
        int target2 = scanner.nextInt();
        if (find(target1) == find(target2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
    }

    private static void Union(int firstMember, int secondMember) {
        int groupNumber1 = find(firstMember);
        int groupNumber2 = find(secondMember);
        if (groupNumber1 != groupNumber2) {
            groups[groupNumber1] = groupNumber2;
        }
    }

    private static int find(int member) {
        if (member == groups[member]) {
            return groups[member];
        } else {
            groups[member] = find(groups[member]);
            return groups[member];
        }
    }
}
