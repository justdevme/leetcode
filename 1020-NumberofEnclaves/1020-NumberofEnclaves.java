// Last updated: 6/4/2026, 6:45:37 PM
1class Solution {
2    // Direction Array Idiom
3    private static final int[] dr = {-1, 1, 0, 0};
4    private static final int[] dc = {0, 0, -1, 1};
5
6    public int numEnclaves(int[][] grid) {
7        int R = grid.length;
8        int C = grid[0].length;
9
10        // Bước 1: Duyệt biên Cột đầu và Cột cuối (grid truyền vào đầu tiên)
11        for (int r = 0; r < R; r++) {
12            if (grid[r][0] == 1) dfs(grid, r, 0, R, C);
13            if (grid[r][C - 1] == 1) dfs(grid, r, C - 1, R, C);
14        }
15
16        // Bước 2: Duyệt biên Dòng đầu và Dòng cuối
17        for (int c = 0; c < C; c++) {
18            if (grid[0][c] == 1) dfs(grid, 0, c, R, C);
19            if (grid[R - 1][c] == 1) dfs(grid, R - 1, c, R, C);
20        }
21
22        // Bước 3: Đếm những ô đất bị cô lập còn sót lại
23        int enclaveCount = 0;
24        for (int r = 0; r < R; r++) {
25            for (int c = 0; c < C; c++) {
26                if (grid[r][c] == 1) {
27                    enclaveCount++;
28                }
29            }
30        }
31
32        return enclaveCount;
33    }
34
35  
36    private void dfs(int[][] grid, int r, int c, int R, int C) {
37        // Mutate Input: Biến đất thành nước để đánh dấu visited
38        grid[r][c] = 0; 
39
40        for (int i = 0; i < 4; i++) {
41            int nr = r + dr[i];
42            int nc = c + dc[i];
43
44            // Bounds Check + Chỉ đi tiếp nếu gặp đất (1)
45            if (nr >= 0 && nr < R && nc >= 0 && nc < C && grid[nr][nc] == 1) {
46                dfs(grid, nr, nc, R, C); // Chú ý truyền đúng thứ tự ở đây nữa nhé
47            }
48        }
49    }
50}