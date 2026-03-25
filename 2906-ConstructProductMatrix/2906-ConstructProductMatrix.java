// Last updated: 3/25/2026, 11:33:40 PM
1class Solution {
2    public int[][] constructProductMatrix(int[][] grid) {
3        int size = grid.length * grid[0].length;
4        int MOD = 12345;
5
6        int[] arr = new int[size];
7        int idx = 0;
8        for (int i = 0; i < grid.length; i++) {
9            for (int j = 0; j < grid[0].length; j++) {
10                arr[idx] = grid[i][j] % MOD;
11                idx++;
12            }
13        }
14        int[] prefix = new int[size];
15        prefix[0] = 1;
16        for(int i = 1; i < size; i++) {
17            prefix[i] = (prefix[i - 1] * arr[i - 1]) % MOD;
18        }
19        
20        int[] suffix = new int[size];
21        suffix[size - 1] = 1;
22        for (int i = size - 2; i >= 0; i--) {
23            suffix[i] = (suffix[i + 1] * arr[i + 1]) % MOD;
24        }
25
26        int[][] result = new int[grid.length][grid[0].length];
27        idx = 0;
28        for(int i = 0; i < grid.length; i++) {
29            for (int j = 0; j < grid[0].length; j++){
30                result[i][j] = (prefix[idx] * suffix[idx]) % MOD;
31                idx++;
32            }
33        }
34        return result;
35    }
36}