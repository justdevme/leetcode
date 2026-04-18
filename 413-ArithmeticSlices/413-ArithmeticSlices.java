// Last updated: 4/18/2026, 1:44:33 PM
1class Solution {
2    public int numberOfArithmeticSlices(int[] nums) {
3        if(nums.length < 3) return 0;
4        int curr = 0;
5        int count = 0;
6        
7        for(int i = 2; i < nums.length; i++) {
8            if(nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
9                curr = curr + 1;
10                count += curr;
11            } else{
12                curr = 0;
13            }
14        }
15        return count;
16    }
17}