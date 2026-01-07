// Last updated: 1/7/2026, 6:24:41 PM
1class Solution {
2    public boolean isPowerOfThree(int n) {
3         if ( n == 1) return true;
4         if (n <= 0) return false;
5         if (n % 3 != 0) return false;
6        return isPowerOfThree(n / 3);
7    }
8}