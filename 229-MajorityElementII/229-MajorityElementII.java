// Last updated: 4/17/2026, 8:34:24 AM
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        int k = nums.length / 3;
4        Map<Integer, Integer> maps = new HashMap<>();
5        for (int x : nums) {
6            maps.put(x, maps.getOrDefault(x, 0) + 1);
7        }
8        List<Integer> res = new ArrayList<>();
9        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
10            if(entry.getValue() > k) {
11                res.add(entry.getKey());
12            }
13        }
14        return res;
15    }
16}