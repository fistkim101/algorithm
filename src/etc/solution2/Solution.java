package etc.solution2;


class Solution {
    int[] groups;

    public boolean solution(int N, int[] A, int[] B) {
        groups = new int[A.length + 1];
        for (int i = 1; i < groups.length; i++) {
            groups[i] = i;
        }

        for (int i = 0; i < A.length; i++) {
            int first = A[i];
            int second = B[i];
            union(first, second);
        }

//        return (find(1) == find(N));

        boolean success = true;
        for (int i = 1; i <= N; i++) {
            if (find(i) != find(i + 1)) {
                success = false;
                break;
            }
        }

        return success;
    }

    private void union(int first, int second) {
        int firstLocation = find(first);
        int secondLocation = find(second);
        if (firstLocation != secondLocation) {
            groups[firstLocation] = secondLocation;
        }
    }

    private int find(int target) {
        if (target == groups[target]) {
            return groups[target];
        } else {
            groups[target] = find(groups[target]);
            return groups[target];
        }
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int N = 4;
        int[] A = new int[]{1, 2, 4, 4, 3};
        int[] B = new int[]{2, 3, 1, 3, 1};

        System.out.println(solution.solution(N, A, B));
    }
}
