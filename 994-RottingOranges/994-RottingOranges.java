// Last updated: 5/18/2026, 10:44:46 PM
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        Queue<int[]> queue = new LinkedList<>();
7        int fresh = 0;
8
9        for (int i = 0; i < m; i++) {
10            for (int j = 0; j < n; j++) {
11                if (grid[i][j] == 2) {
12                    queue.offer(new int[]{i, j});
13                } else if (grid[i][j] == 1) {
14                    fresh++;
15                }
16            }
17        }
18
19        int minutes = 0;
20
21        int[][] dirs = {
22            {-1, 0},
23            {1, 0},
24            {0, -1},
25            {0, 1}
26        };
27
28        while (!queue.isEmpty() && fresh > 0) {
29            int size = queue.size();
30
31            for (int k = 0; k < size; k++) {
32                int[] cur = queue.poll();
33                int row = cur[0];
34                int col = cur[1];
35
36                for (int[] dir : dirs) {
37                    int newRow = row + dir[0];
38                    int newCol = col + dir[1];
39
40                    if (
41                        newRow >= 0 && newRow < m &&
42                        newCol >= 0 && newCol < n &&
43                        grid[newRow][newCol] == 1
44                    ) {
45                        grid[newRow][newCol] = 2;
46                        fresh--;
47                        queue.offer(new int[]{newRow, newCol});
48                    }
49                }
50            }
51
52            minutes++;
53        }
54
55        return fresh == 0 ? minutes : -1;
56    }
57}