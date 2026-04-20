// Last updated: 4/20/2026, 10:02:16 AM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int left = 0, right = nums.length - 1;
4        while (left < right) {
5            int mid = (left + right) / 2;
6            if(nums[mid] > nums[mid + 1]) {
7                right = mid;
8            } else {
9                left = mid + 1;
10            }
11        }
12        return left;
13    }
14}