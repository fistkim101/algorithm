package programers.ftest.solution3;

import java.util.HashMap;
import java.util.Map;

class Node {
    int index;
    Node left;
    Node right;

    public Node(int index, Node left, Node right) {
        this.index = index;
        this.left = left;
        this.right = right;
    }

    public boolean isParentOf(Node target, Map<Integer, Node> nodes) {
        if (this.left == null && this.right == null) {
            return false;
        }

        if (this.left != null && this.left.index == target.index) {
            return true;
        }

        if (this.right != null && this.right.index == target.index) {
            return true;
        }

        if (this.left != null && this.left.isParentOf(target, nodes)) {
            return true;
        }

        if (this.right != null && this.right.isParentOf(target, nodes)) {
            return true;
        }

        return false;
    }
}

public class Solution {
    final Map<Integer, Node> nodes = new HashMap<>();

    public long solution(int[][] parking) {
        for (int i = 0; i < parking.length; i++) {
            int leftIndex = parking[i][0];
            int rightIndex = parking[i][1];
            if (leftIndex == -1 && rightIndex == -1) {
                continue;
            }

            if (nodes.get(i) == null) {
                nodes.put(i, new Node(i, null, null));
            }

            if (nodes.get(leftIndex) == null) {
                nodes.put(leftIndex, new Node(leftIndex, null, null));
            }

            if (nodes.get(rightIndex) == null) {
                nodes.put(rightIndex, new Node(rightIndex, null, null));
            }

            final Node targetNode = nodes.get(i);
            targetNode.left = nodes.get(leftIndex);
            targetNode.right = nodes.get(rightIndex);
        }

        int maxIndex = nodes.keySet().stream().mapToInt(Integer::intValue).max().getAsInt();
        int answerCount = 0;
        for (int i = maxIndex; i >= 1; i--) {
            for (int j = maxIndex; j >= 1; j--) {
                if (i == j) {
                    continue;
                }

                final Node firstTarget = nodes.get(i);
                final Node secondTarget = nodes.get(j);

                if ((!firstTarget.isParentOf(secondTarget, nodes) && !secondTarget.isParentOf(firstTarget, nodes))) {
                    answerCount++;
                }
            }
        }

        return answerCount / 2;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[][] parking = {{1, 2}, {3, 4}, {-1, -1}, {-1, -1}, {-1, -1}};
        System.out.println(T.solution(parking)); // 4
    }
}
