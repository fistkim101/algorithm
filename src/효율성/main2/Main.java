package 효율성.main2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeA = scanner.nextInt();
        int[] arrayA = new int[sizeA];
        for (int i = 0; i < sizeA; i++) {
            arrayA[i] = scanner.nextInt();
        }
        Arrays.sort(arrayA);

        int sizeB = scanner.nextInt();
        int[] arrayB = new int[sizeB];
        for (int i = 0; i < sizeB; i++) {
            arrayB[i] = scanner.nextInt();
        }
        Arrays.sort(arrayB);

        int indexA = 0;
        int indexB = 0;

        List<Integer> result = new ArrayList<>();
        while (indexA < sizeA && indexB < sizeB) {
            int elementA = arrayA[indexA];
            int elementB = arrayB[indexB];

            if (elementA == elementB) {
                result.add(elementA);
                indexA++;
                indexB++;
            } else {
                if (elementA > elementB) {
                    indexB++;
                } else {
                    indexA++;
                }
            }
        }

        result.forEach(element -> {
            System.out.print(element + " ");
        });
    }
}
