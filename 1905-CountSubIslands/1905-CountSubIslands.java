// Last updated: 5/28/2026, 1:27:38 PM
1class Solution {
2    int rows, cols;
3    public int countSubIslands(int[][] grid1, int[][] grid2) {
4        rows = grid2.length;
5        cols = grid2[0].length;
6
7        int count = 0;
8
9        for (int i = 0; i < rows; i++) {
10            for (int j = 0; j < cols; j++) {
11
12                if (grid2[i][j] == 1) {
13                    boolean isSubIsland = dfs(grid1, grid2, i, j);
14
15                    if (isSubIsland) {
16                        count++;
17                    }
18                }
19            }
20        }
21
22        return count;
23    }
24
25    private boolean dfs(int[][] grid1, int[][] grid2, int r, int c) {
26        // Nếu ra ngoài biên hoặc gặp nước thì không ảnh hưởng
27        if (r < 0 || r >= rows || c < 0 || c >= cols || grid2[r][c] == 0) {
28            return true;
29        }
30
31        // đánh dấu visited
32        grid2[r][c] = 0;
33
34        boolean isSubIsland = true;
35
36        if (grid1[r][c] == 0) {
37            isSubIsland = false;
38        }
39
40        boolean up = dfs(grid1, grid2, r - 1, c);
41        boolean down = dfs(grid1, grid2, r + 1, c);
42        boolean left = dfs(grid1, grid2, r, c - 1);
43        boolean right = dfs(grid1, grid2, r, c + 1);
44
45        return isSubIsland && up && down && left && right;
46    }
47}