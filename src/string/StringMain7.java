package string;

import java.util.Scanner;

public class StringMain7 {
    public void solution(String str) {
        String original = str.toLowerCase();
        String reversed = new StringBuilder(str.toLowerCase()).reverse().toString();
        if(original.equals(reversed)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

//        char[] chars = str.toLowerCase().toCharArray();
//        int leftIndex = 0;
//        int rightIndex = chars.length - 1;
//        boolean isSame = true;
//        while (leftIndex < rightIndex) {
//            if (chars[leftIndex] != chars[rightIndex]) {
//                isSame = false;
//                System.out.println("NO");
//                break;
//            }
//            leftIndex++;
//            rightIndex--;
//        }
//
//        if (isSame) {
//            System.out.println("YES");
//        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringMain7 T = new StringMain7();
        T.solution(str);
    }
}
