// Last updated: 5/28/2026, 4:33:17 PM
1class Solution {
2    int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1},{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
3    public int shortestPathBinaryMatrix(int[][] grid) {
4        if (grid[0][0] == 1 || grid[grid.length - 1][grid[0].length - 1] == 1) return -1;
5        Queue<int[]> queue = new LinkedList<>();
6        boolean[][] visited = new boolean [grid.length][grid[0].length];
7
8        queue.offer(new int[]{0, 0, 0});
9        visited[0][0] = true;
10
11        while(!queue.isEmpty()) {
12            int[] cur = queue.poll();
13            int r = cur[0], c = cur[1], dist = cur[2];
14
15            if (r == grid.length - 1 && c == grid[0].length - 1) {
16                return dist + 1;
17            }
18            
19            for (int[] d : dirs) {
20                int nr = r + d[0], nc = c + d[1];
21                if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid.length && !visited[nr][nc] && grid[nr][nc] == 0) {
22                    visited[nr][nc] = true;
23                    queue.offer(new int[] {nr, nc, dist + 1});
24                }
25            }
26        }
27        return -1;
28    }
29    
30}