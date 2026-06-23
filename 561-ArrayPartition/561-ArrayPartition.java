// Last updated: 6/23/2026, 11:42:15 PM
1import java.util.Arrays;
2
3class Solution {
4    public int arrayPairSum(int[] nums) {
5        Arrays.sort(nums);
6        int totalSum = 0;
7        
8        for (int i = 0; i < nums.length; i += 2) {
9            totalSum += nums[i];
10        }
11        return totalSum;
12    }
13}