package programers.hash.main3;

import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            String current = phone_book[i];
            String next = phone_book[i + 1];
            if (next.startsWith(current)) {
                return false;
            }
        }

        return true;
    }
}

class Main {
    public static void main(String[] args) {
        Solution T = new Solution();
//        String[] phone_book = new String[]{"119", "97674223", "1195524421"}; // false
//        String[] phone_book = new String[]{"123","456","789"}; // true
        String[] phone_book = new String[]{"12", "123", "1235", "567", "88"}; // false
        System.out.println(T.solution(phone_book));
    }
}
