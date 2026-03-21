// Last updated: 3/21/2026, 6:56:49 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int total = 0;
4        for(int x : nums) {
5            total += x;
6        }
7        int leftSum = 0;
8        for(int i = 0; i < nums.length; i++) {
9            int rightSum = total - leftSum - nums[i]; 
10            if(leftSum == rightSum) {
11                return i;
12            }
13            leftSum += nums[i];
14        }
15        return -1;
16        
17    }
18}