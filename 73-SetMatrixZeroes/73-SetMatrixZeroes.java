// Last updated: 4/17/2026, 9:20:48 PM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        boolean[] rows = new boolean[matrix.length];
4        boolean[] cols = new boolean[matrix[0].length];
5
6        for(int i = 0; i < matrix.length; i++) {
7            for(int j = 0; j < matrix[0].length; j++) {
8                if(matrix[i][j] == 0) {
9                    rows[i] = true;
10                    cols[j] = true;
11                }
12            }
13        }
14        for(int i = 0; i < rows.length; i++) {
15            if (rows[i]) {
16                for (int j = 0; j < matrix[0].length; j++) {
17                    matrix[i][j] = 0;
18                }
19            }
20        }
21
22        for(int i = 0; i < cols.length; i++) {
23            if (cols[i]) {
24                for (int j = 0; j < matrix.length; j++) {
25                    matrix[j][i] = 0;
26                }
27            }
28        }
29        
30    }
31}