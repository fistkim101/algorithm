package programers.ftest.solution1;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public String[] solution(String[] card, String[] word) {
        final List<String> answer = new ArrayList<>();
        for (String targetWord : word) {
            final List<String> cardCopy = Arrays.stream(card)
                    .collect(Collectors.toList());

            int changeCount = 0;
            Set<Integer> rowSet = new HashSet<>();
            for (int i = 0; i < targetWord.length(); i++) {
                final String targetChar = String.valueOf(targetWord.charAt(i));
                for (int j = 0; j < cardCopy.size(); j++) {
                    if (cardCopy.get(j).contains(targetChar)) {
                        cardCopy.set(j, cardCopy.get(j).replaceFirst(targetChar, ""));
                        changeCount++;
                        rowSet.add(j);
                        break;
                    }
                }
            }

            if (changeCount == targetWord.length() && rowSet.size() == 3) {
                answer.add(targetWord);
            }
        }

        if (answer.isEmpty()) {
            return new String[]{"-1"};
        } else {
            return answer.toArray(new String[0]);
        }
    }

    public static void main(String[] args) {
        Solution T = new Solution();
//        String[] answer = T.solution(new String[]{"ABACDEFG", "NOPQRSTU", "HIJKLKMM"}, new String[]{"GPQM", "GPMZ", "EFU", "MMNA"});
        String[] answer = T.solution(new String[]{"AABBCCDD", "KKKKJJJJ", "MOMOMOMO"}, new String[]{"AAAKKKKKMMMMM", "ABCDKJ"});
        for (String str : answer) {
            System.out.println(str);
        }
    }
}
