// Last updated: 1/7/2026, 12:36:14 AM
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Kiểm tra các hàng
        for (int i = 0; i < board.length; i++) {
            int[] frequency = new int[9];
            for (int j = 0; j < board[i].length; j++) {
                if (Character.isDigit(board[i][j])) {
                    int num = board[i][j] - '1';
                    frequency[num]++;
                    if (frequency[num] >= 2) {
                        return false;
                    }
                }
            }
        }

        // Kiểm tra các cột
        for (int j = 0; j < board[0].length; j++) {
            int[] frequency = new int[9];
            for (int i = 0; i < board.length; i++) {
                if (Character.isDigit(board[i][j])) {
                    int num = board[i][j] - '1';
                    frequency[num]++;
                    if (frequency[num] >= 2) {
                        return false;
                    }
                }
            }
        }

        // Kiểm tra các khối 3x3
        for (int block = 0; block < 9; block++) {
            int[] frequency = new int[9];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = 3 * (block / 3) + i;
                    int col = 3 * (block % 3) + j;
                    if (Character.isDigit(board[row][col])) {
                        int num = board[row][col] - '1';
                        frequency[num]++;
                        if (frequency[num] >= 2) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
