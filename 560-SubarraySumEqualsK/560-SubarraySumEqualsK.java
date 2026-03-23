// Last updated: 3/23/2026, 12:37:01 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        Map<Integer, Integer> count = new HashMap<>();
4        int sum = 0;
5        int res = 0;
6
7        count.put(0, 1);
8
9        for (int i = 0; i < nums.length; i++) {
10            sum += nums[i];
11            res += count.getOrDefault(sum - k, 0);
12            count.put(sum, count.getOrDefault(sum, 0) + 1);
13        }
14
15        return res;
16    }
17}