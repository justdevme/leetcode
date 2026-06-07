// Last updated: 6/7/2026, 10:04:25 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int result = 0;
4
5        for (int num : nums) {
6            result = result ^ num;
7        }
8
9        return result;
10    }
11}