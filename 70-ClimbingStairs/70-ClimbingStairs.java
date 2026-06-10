// Last updated: 6/10/2026, 8:28:44 PM
1class Solution {
2    public int climbStairs(int n) {
3        // Trường hợp cơ bản
4        if (n <= 2) {
5            return n;
6        }
7        
8        // Mảng dp lưu số cách đi đến bậc i
9        int[] dp = new int[n + 1];
10        dp[1] = 1;
11        dp[2] = 2;
12        
13        // Tính toán các bậc tiếp theo dựa trên 2 bậc trước đó
14        for (int i = 3; i <= n; i++) {
15            dp[i] = dp[i - 1] + dp[i - 2];
16        }
17        
18        return dp[n];
19    }
20}