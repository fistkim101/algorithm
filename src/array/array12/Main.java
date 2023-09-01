package array.array12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int memberCount = scanner.nextInt();
        int testCount = scanner.nextInt();

        int[][] array = new int[testCount][memberCount];
        for (int i = 0; i < testCount; i++) {
            for (int j = 0; j < memberCount; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int count = 0;
        for (int i = 1; i <= memberCount; i++) {
            for (int j = 1; j <= memberCount; j++) {
                if (i == j) {
                    continue;
                }

                boolean iIsMentor = true;
                for (int k = 0; k < testCount; k++) {
                    int iPosition = 0;
                    int jPosition = 0;
                    for (int p = 0; p < memberCount; p++) {
                        if (array[k][p] == i) {
                            iPosition = p;
                        }
                        if (array[k][p] == j) {
                            jPosition = p;
                        }
                    }

                    if (iPosition > jPosition) {
                        iIsMentor = false;
                        break;
                    }
                }

                if (iIsMentor) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

}
