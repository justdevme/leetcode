// Last updated: 1/7/2026, 6:34:53 PM
1class Solution {
2    public boolean isHappy(int n) {
3        if (n == 1 || n == 7) return true;
4        else if (n < 10) return false;
5        else {
6            int sum = 0;
7            while (n > 0){
8                int temp = n % 10;
9                sum += temp * temp;
10                n = n / 10;
11            }
12            return isHappy(sum);
13        }
14    }
15}