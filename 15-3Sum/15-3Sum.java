// Last updated: 3/1/2026, 2:00:04 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        int l = 0, r = nums.length - 1;
5        Arrays.sort(nums);
6        
7        for(int i = 0; i < nums.length - 2; i++) {
8            if(nums[i] > 0) break;
9            if(i > 0 && nums[i] == nums[i - 1]) continue;
10            int left = i + 1;
11            int right = nums.length - 1;
12
13           
14            while (left < right) {
15                int sum = nums[i] + nums[left] + nums[right];
16                if (sum == 0) {
17                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
18
19                    left++;
20                    right--;
21
22                    // 3) skip duplicate left
23                    while (left < right && nums[left] == nums[left - 1]) {
24                        left++;
25                    }
26                    // 4) skip duplicate right
27                    while (left < right && nums[right] == nums[right + 1]) {
28                        right--;
29                    }
30
31                } else if (sum < 0) {
32                    left++;   // need bigger sum
33                } else {
34                    right--;  // need smaller sum
35                }
36            }
37        }
38        return res;
39    }
40}