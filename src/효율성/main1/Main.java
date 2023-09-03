package 효율성.main1;

import java.util.ArrayList;
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

        int sizeB = scanner.nextInt();
        int[] arrayB = new int[sizeB];
        for (int i = 0; i < sizeB; i++) {
            arrayB[i] = scanner.nextInt();
        }

        int indexA = 0;
        int indexB = 0;

        List<Integer> result = new ArrayList<>();
        while (indexA < sizeA && indexB < sizeB) {
            int elementA = arrayA[indexA];
            int elementB = arrayB[indexB];

            if (elementA > elementB) {
                result.add(elementB);
                indexB++;
            } else if (elementA < elementB) {
                result.add(elementA);
                indexA++;
            } else {
                result.add(elementA);
                result.add(elementB);
                indexA++;
                indexB++;
            }
        }

        while (indexA < sizeA) {
            result.add(arrayA[indexA]);
            indexA++;
        }

        while (indexB < sizeB) {
            result.add(arrayB[indexB]);
            indexB++;
        }

        result.forEach(element -> {
            System.out.print(element + " ");
        });
    }
}
