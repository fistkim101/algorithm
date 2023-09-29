package programers.hash.main2;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> all = new HashMap<>();
        for (String player : participant) {
            all.put(player, all.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            if (all.containsKey(player)) {
                all.put(player, all.get(player) - 1);

                if (all.get(player) == 0) {
                    all.remove(player);
                }
            }
        }

        for (String player : all.keySet()) {
            return player;
        }

        return null;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // "leo"
//        String[] participant = new String[]{"leo", "kiki", "eden"};
//        String[] completion = new String[]{"eden", "kiki"};

        // "vinko"
//        String[] participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = new String[]{"josipa", "filipa", "marina", "nikola"};
//
//        // "mislav"
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};

        System.out.println(solution.solution(participant, completion));
    }
}
