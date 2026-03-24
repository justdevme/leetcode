// Last updated: 3/24/2026, 10:25:02 AM
1class Solution {
2    public boolean checkSubarraySum(int[] nums, int k) {
3        Map<Integer, Integer> map = new HashMap<>();
4        map.put(0, -1);
5
6        int sum = 0;
7        for (int i = 0; i < nums.length; i++) {
8            sum += nums[i];
9            int remainder = sum % k;
10
11            if(map.containsKey(remainder)) {
12                if (i - map.get(remainder) >= 2) {
13                    return true;
14                }
15            } else {
16                map.put(remainder, i);
17            }
18        }
19        return false;
20    }
21}