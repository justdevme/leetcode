// Last updated: 4/19/2026, 11:19:51 AM
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        Arrays.sort(nums);
4        int bestSum = nums[0] + nums[1] + nums[2];
5
6        for(int i = 0; i < nums.length - 2; i++) {
7            int left = i + 1;
8            int right = nums.length -1;
9
10            while(left < right) {
11                int sum = nums[i] + nums[left] + nums[right];
12                if(Math.abs(sum - target) < Math.abs(bestSum - target)) {
13                    bestSum = sum;
14                }
15                if (sum < target) {
16                    left++;
17                } else if(sum > target) {
18                    right--;
19                } else {
20                    return sum;
21                }
22            }
23        }
24        return bestSum;
25    }
26}