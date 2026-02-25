// Last updated: 2/25/2026, 9:51:59 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Map<Integer, Integer> map = new HashMap<>();
4        for (int x : nums) {
5            map.put(x, map.getOrDefault(x, 0) + 1);
6        }
7        for (Integer key : map.keySet()) {
8            if (map.get(key) > 1) {
9                return true;
10            }
11        }
12        return false;
13    }
14}