package string;

import java.util.Scanner;

public class StringMain8 {
    public void solution2(String str) {
        String converted = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reversed = new StringBuilder(converted).reverse().toString();
        if (converted.equals(reversed)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public void solution(String str) {
        String converted = str.toUpperCase().replaceAll("[^A-Z]", "");
        char[] chars = converted.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                System.out.println("NO");
                return;
            }
            left++;
            right--;
        }

        System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringMain8 T = new StringMain8();
        T.solution(str);
    }
}
