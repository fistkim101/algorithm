package programers.heap.solution3;

import java.util.TreeMap;

class Solution {
    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (String operation : operations) {
            String[] parts = operation.split(" ");
            String command = parts[0];
            int num = Integer.parseInt(parts[1]);

            if (command.equals("I")) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            } else if (command.equals("D")) {
                if (map.isEmpty()) continue;

                int keyToDelete = (num == 1) ? map.lastKey() : map.firstKey();
                int count = map.get(keyToDelete);
                if (count == 1) {
                    map.remove(keyToDelete);
                } else {
                    map.put(keyToDelete, count - 1);
                }
            }

        }

        if (map.isEmpty()) {
            return new int[]{0, 0};
        }

        return new int[]{map.lastKey(), map.firstKey()};
    }
}