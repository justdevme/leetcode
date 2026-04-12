// Last updated: 4/12/2026, 4:29:09 PM
1class Solution {
2    public int maxTurbulenceSize(int[] arr) {
3        int up = 1, down = 1, res = 1;
4
5        for (int i = 1; i < arr.length; i++) {
6            // tăng
7            if (arr[i] > arr[i - 1])  {
8                up = down + 1;
9                down = 1;
10            } else if (arr[i] < arr[i - 1]) {
11                down = up + 1;
12                up = 1;
13            } else {
14                up = 1;
15                down = 1;
16            }
17
18            res = Math.max(res, Math.max(up, down));
19        }
20        return res;
21    }
22}