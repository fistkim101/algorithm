package etc.solution1;

public class Solution {
    public int solution(int N, String S) {
        int columnCount = 10;
        int rowCount = N;
        int[][] seats = new int[rowCount][columnCount];
        this.fillAlreadyBookedSeat(seats, S);

        int count = 0;
        for (int row = 0; row < N; row++) {
            for (int column = 1; column <= 5; column++) {
                boolean success = true;
                for (int temp = column; temp < column + 4; temp++) {
                    if (seats[row][temp] == 1) {
                        success = false;
                        break;
                    }
                }

                if (success) {
                    count++;
                    seats[row][column] = 1;
                    seats[row][column + 1] = 1;
                    seats[row][column + 2] = 1;
                    seats[row][column + 3] = 1;
                }
            }
        }

        return count;
    }

    private void fillAlreadyBookedSeat(int[][] seats, String seatNumbers) {
        if (seatNumbers.isEmpty()) {
            return;
        }

        final String SPACE = " ";
        for (String seatNumber : seatNumbers.split(SPACE)) {
            String[] splited = this.splitNumber(seatNumber);
            int rowNumber = Integer.parseInt(splited[0]) - 1;
            int columnNumber = this.getColumNumber(splited[1]);
            seats[rowNumber][columnNumber] = 1;
        }
    }

    private String[] splitNumber(String seatNumber) {
        final StringBuilder row = new StringBuilder();
        final StringBuilder column = new StringBuilder();
        for (Character c : seatNumber.toCharArray()) {
            if (Character.isDigit(c)) {
                row.append(c);
            } else {
                column.append(c);
            }
        }

        return new String[]{row.toString(), column.toString()};
    }

    private int getColumNumber(String column) {
        switch (column) {
            case "A":
                return 0;
            case "B":
                return 1;
            case "C":
                return 2;
            case "D":
                return 3;
            case "E":
                return 4;
            case "F":
                return 5;
            case "G":
                return 6;
            case "H":
                return 7;
            case "J":
                return 8;
            case "K":
                return 9;
            default: {
                throw new IllegalArgumentException();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int result = solution.solution(2, "1A 2F 1C"); // 2
//        int result = solution.solution(1, ""); // 2
        int result = solution.solution(22, "1A 3C 2B 20G 5A"); // 41
        System.out.println(result);
    }
}