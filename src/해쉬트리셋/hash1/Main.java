package 해쉬트리셋.hash1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String vote = scanner.next();
        char[] array = vote.toCharArray();

        HashMap<Character, Integer> voteSet = new HashMap<>();
        for (Character key : array) {
            voteSet.put(key, voteSet.getOrDefault(key, 0) + 1);

//            Integer currentValue = voteSet.get(key);
//            if (currentValue == null) {
//                voteSet.put(key, 1);
//            } else {
//                Integer addedValue = currentValue + 1;
//                voteSet.put(key, addedValue);
//            }
        }

        int max = 0;
        Character leader = null;
        for (Map.Entry<Character, Integer> entry : voteSet.entrySet()) {
            if (max < entry.getValue()) {
                leader = entry.getKey();
                max = entry.getValue();
            }
        }

        System.out.println(leader);
    }
}
