// Last updated: 5/25/2026, 10:55:13 PM
1class Solution {
2    public int numIslands(char[][] grid) {
3       int count = 0;
4       boolean[][] visited = new boolean[grid.length][grid[0].length];
5       for (int r = 0; r < grid.length; r++) {
6            for (int c = 0; c < grid[0].length; c++) {
7                if (grid[r][c] == '1' && !visited[r][c]) {
8                    dfs(grid, visited, r, c);
9                    count++;
10                }
11            }
12       }
13       return count;
14    }
15
16    void dfs(char[][] grid, boolean[][] visited, int r, int c) {
17        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) return;
18        if (grid[r][c] == '0' || visited[r][c]) return; 
19
20        visited[r][c] = true;
21
22        dfs(grid, visited, r - 1, c);
23        dfs(grid, visited, r + 1, c);
24        dfs(grid, visited, r, c - 1);
25        dfs(grid, visited, r, c + 1);
26    }
27}