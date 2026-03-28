// Last updated: 3/28/2026, 4:10:02 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int low = 0, high = nums.length - 1;
4        
5        while (low <= high) {
6            int mid = low + (high - low) / 2;
7            
8            if (nums[mid] == target) {
9                return mid;
10            } else if (nums[mid] < target) {
11                low = mid + 1;
12            } else {
13                high = mid - 1;
14            }
15        }
16        return low;
17    }
18}