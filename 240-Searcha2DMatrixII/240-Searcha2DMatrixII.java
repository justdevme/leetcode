// Last updated: 4/20/2026, 10:59:08 AM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        for(int i = 0; i < matrix.length; i++){
4            int l = 0, r = matrix[0].length - 1;
5            while (l <= r) {
6                 int mid = (l + r) / 2;
7                if (matrix[i][mid] == target) return true;
8                else if (matrix[i][mid] < target) l = mid + 1;
9                else r = mid - 1;
10            }
11        }
12        return false;
13    }
14}