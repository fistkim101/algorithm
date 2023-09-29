package programers.hash.main4;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> cases = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            cases.put(clothes[i][1], cases.getOrDefault(clothes[i][1], 0) + 1);
        }

        int answer = 1;
        for (Integer value : cases.values()) {
            answer *= (value + 1);
        }

        return answer - 1;
    }
}

class Main {
    public static void main(String[] args) {

    }
}
