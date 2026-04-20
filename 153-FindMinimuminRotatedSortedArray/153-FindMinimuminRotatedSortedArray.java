// Last updated: 4/20/2026, 10:35:27 AM
1class Solution {
2    public int findMin(int[] nums) {
3        // tăng dần -> đột nhiên tụt xuống -> min ở đó
4        int left = 0, right = nums.length - 1;
5        while(left < right) {
6            int mid = (left + right) / 2;
7            if(nums[mid] > nums[right]){
8               left = mid + 1;
9            } else {
10                right = mid;
11            }
12        }
13        return nums[left];
14    }
15}