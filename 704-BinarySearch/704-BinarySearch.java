// Last updated: 3/28/2026, 3:55:47 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int low = 0, high = nums.length - 1;
4        while (low <= high) {
5            int mid = low + (high - low) / 2;
6            if(nums[mid] == target){
7                return mid;
8            } else if (nums[mid] < target) {
9                low = mid + 1;
10            } else {
11                high = mid - 1;
12            }
13        }
14        return -1;
15    }
16}