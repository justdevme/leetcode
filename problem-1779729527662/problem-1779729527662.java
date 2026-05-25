// Last updated: 5/26/2026, 12:18:47 AM
1class Solution {
2    public int maxAreaOfIsland(int[][] grid) {
3        int res = 0;
4        boolean[][] visited = new boolean[grid.length][grid[0].length];
5        for (int r = 0; r < grid.length; r++) {
6            for (int c = 0; c < grid[0].length; c++) {
7                if (grid[r][c] == 1 && !visited[r][c]) {
8                    res = Math.max(res, dfs(grid, visited, r, c));
9                }
10            }
11        }
12        return res;
13    }
14    int dfs (int[][] grid, boolean[][] visited, int r, int c) {
15        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) return 0;
16        if (grid[r][c] == 0 || visited[r][c]) return 0;
17               
18        visited[r][c] = true;
19
20        return 1 + dfs (grid, visited, r - 1, c) + dfs (grid, visited, r + 1, c) +  dfs (grid, visited, r, c - 1) +  dfs (grid, visited, r, c + 1);
21    }
22}