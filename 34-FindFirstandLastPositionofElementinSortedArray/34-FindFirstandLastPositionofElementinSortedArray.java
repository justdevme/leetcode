// Last updated: 3/22/2026, 3:19:14 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int first = -1, last = -1;
4        for (int i = 0; i < nums.length; i++) {
5            if (nums[i] == target) {
6                if(first == -1) {
7                    first = i;
8                }
9                last = i;
10            }
11        }
12        return new int[] {first, last};
13    }
14}