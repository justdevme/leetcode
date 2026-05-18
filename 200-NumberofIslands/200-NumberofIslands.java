// Last updated: 5/18/2026, 11:47:39 AM
1class Solution {
2    public int numIslands(char[][] grid) {
3        Queue<int[]> queue = new LinkedList<>();
4        boolean[][] visited = new boolean[grid.length][grid[0].length];
5        int count = 0;
6        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
7        for (int i = 0; i < grid.length; i++) {
8            for (int j = 0; j < grid[0].length; j++) {
9                // điều kiện gì thì BFS + count++?
10                int[] start = {i, j};
11                
12                if (grid[i][j] == '1' && !visited[i][j]){
13                    queue.add(start);
14                    visited[i][j] = true;
15                    while(!queue.isEmpty()) {
16                        int[] node = queue.poll();
17                        int row = node[0];
18                        int col = node[1];
19                        for (int[] dir : dirs) {
20
21                            int newRow = row + dir[0];
22                            int newCol = col + dir[1];
23                            if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length &&!visited[newRow][newCol] && grid[newRow][newCol] == '1') {
24                                visited[newRow][newCol] = true;
25                                queue.add(new int[]{newRow, newCol});
26                            }
27                        }
28
29                    }
30                    count++;
31                }
32            }
33        }
34        return count;
35    }
36}