package array.array11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int memberCount = scanner.nextInt();
        int[][] array = new int[memberCount][5];
        for (int i = 0; i < memberCount; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int leader = 0;
        int maxCount = 0;
        for (int i = 0; i < memberCount; i++) {
            int sameCount = 0;
            for (int j = 0; j < memberCount; j++) {
                for (int k = 0; k < 5; k++) {
                    int currentGrade = array[i][k];
                    int targetGrade = array[j][k];
                    if (currentGrade == targetGrade) {
                        sameCount++;
                        break;
                    }
                }
            }

            if (maxCount < sameCount) {
                maxCount = sameCount;
                leader = i;
            }
        }

        System.out.println(leader + 1);
    }

}
