package programers.search.solution3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(String numbers) {
        int answer = 0;
        char[] numChars = numbers.toCharArray();
        Set<Integer> permutationsSet = new HashSet<>();

        // 가능한 모든 조합 생성
        for (int i = 1; i <= numChars.length; i++) {
            boolean[] visited = new boolean[numChars.length];
            generatePermutations(numChars, new StringBuilder(), visited, permutationsSet, i);
        }

        // 소수 개수 세기
        for (int num : permutationsSet) {
            if (isPrime(num)) {
                answer++;
            }
        }

        return answer;
    }

    private void generatePermutations(char[] numChars, StringBuilder current, boolean[] visited, Set<Integer> permutationsSet, int length) {
        if (current.length() == length) {
            permutationsSet.add(Integer.parseInt(current.toString()));
            return;
        }
        for (int i = 0; i < numChars.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                current.append(numChars[i]);
                generatePermutations(numChars, current, visited, permutationsSet, length);
                current.deleteCharAt(current.length() - 1);
                visited[i] = false;
            }
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
