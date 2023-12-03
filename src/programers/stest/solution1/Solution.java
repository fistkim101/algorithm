package programers.stest.solution1;

import java.util.*;
import java.util.stream.Collectors;

class Node implements Comparable<Node> {
    int first;
    int second;
    int distance;

    public Node(int first, int second, int distance) {
        this.first = first;
        this.second = second;
        this.distance = distance;
    }

    @Override
    public int compareTo(Node o) {
        return this.first - o.first;
    }
}

public class Solution {
    List<Node> nodes;

    public int[] solution(int n, int k, int[][] roads) {
        nodes = new ArrayList<>();
        for (int i = 0; i < roads.length; i++) {
            int first = roads[i][0];
            int second = roads[i][1];
            int distance = roads[i][2];
            nodes.add(new Node(first, second, distance));
        }
        Collections.sort(nodes);

        int currentPosition = 0;
        int sum = 0;
        Set<Integer> endPoint = new HashSet<>();
        move(0, 0, k, endPoint);

        if (endPoint.isEmpty()) {
            return new int[]{-1};
        }

        List<Integer> results = new ArrayList<>(endPoint);
        return results.stream().mapToInt(Integer::intValue).toArray();
    }

    private void move(int currentPosition, int sum, int k, Set<Integer> endPoint) {
        if (sum > k) {
            return;
        }

        if (sum == k) {
            endPoint.add(currentPosition);
            return;
        }

        List<Node> nextNodes = getNextNodes(currentPosition);
        if (nextNodes.isEmpty()) {
            return;
        } else {
            for (Node node : nextNodes) {
                int temp = currentPosition;
                sum += node.distance;
                int first = node.first;
                int second = node.second;
                if (first == currentPosition) {
                    currentPosition = second;
                } else {
                    currentPosition = first;
                }
                move(currentPosition, sum, k, endPoint);
                sum -= node.distance;
                currentPosition = temp;
            }
        }
    }

    private List<Node> getNextNodes(int currentPosition) {
        return nodes.stream()
                .filter(node -> (node.first == currentPosition) || (node.second == currentPosition))
                .collect(Collectors.toList());
    }
}

class Main {
    public static void main(String[] args) {
        Solution T = new Solution();
        int n = 6;
        int k = 17;
        int[][] roads = new int[][]{{5, 4, 6}, {5, 2, 5}, {0, 4, 2}, {2, 3, 3}, {1, 2, 7}, {0, 1, 3}};

//        int n = 4;
//        int k = 10;
//        int[][] roads = new int[][]{{0, 1, 2}, {0, 2, 3}};

//        int n = 4;
//        int k = 11;
//        int[][] roads = new int[][]{{0, 1, 2}, {1, 2, 7}, {2, 3, 10}, {3, 0, 9}};

        int[] answer = T.solution(n, k, roads);
        for (int num : answer) {
            System.out.print(num + " ");
        }
    }
}