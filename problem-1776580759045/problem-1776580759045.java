// Last updated: 4/19/2026, 1:39:19 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int k = 0;
4
5        for(int i = 0; i < nums.length; i++) {
6            if (k < 2 || nums[i] != nums[k - 2]) {
7                nums[k] = nums[i];
8                k++;
9            }
10        }
11        return k;
12    }
13}