// Last updated: 6/4/2026, 6:35:12 PM
1class Solution {
2    private static final int[][] DIRS = {
3        {-1, 0}, {1, 0}, {0, -1}, {0, 1}
4    };
5    public int islandPerimeter(int[][] grid) {
6        int rows = grid.length;
7        int cols = grid[0].length;
8        int perimeter = 0;
9
10        for (int r = 0; r < rows; r++) {
11            for (int c = 0; c < cols; c++) {
12                if (grid[r][c] == 1) {
13                    for (int[] dir : DIRS) {
14                        int nr = r + dir[0];
15                        int nc = c + dir[1];
16                        
17                        // bound check
18                        if (nr < 0 || nr >= rows || nc < 0 || nc >= cols || grid[nr][nc] == 0) {
19                            perimeter++;
20                        }
21                    }
22                }
23            }
24        }
25        return perimeter;
26    }
27}