// Last updated: 4/20/2026, 11:02:33 AM
1// cách 2 
2class Solution {
3    public boolean searchMatrix(int[][] matrix, int target) {
4        int row = 0;
5        int col = matrix[0].length - 1;
6
7        while (row < matrix.length && col >= 0) {
8            if (matrix[row][col] == target) return true;
9            else if (matrix[row][col] > target) col--;
10            else row++;
11        }
12
13        return false;
14    }
15}