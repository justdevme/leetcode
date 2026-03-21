// Last updated: 3/21/2026, 9:12:32 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        
4        Map<Integer, Integer> count = new HashMap<>();
5        int sum = 0;
6        int res = 0;
7        count.put(0, 1);
8        for (int i = 0; i < nums.length; i++) {
9            sum += nums[i];
10            res += count.getOrDefault(sum - k, 0);
11            count.put(sum, count.getOrDefault(sum, 0) + 1);
12        }
13        return res;
14
15    }
16}