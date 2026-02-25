// Last updated: 2/25/2026, 11:29:37 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        Map<Integer, Integer> map = new HashMap<>();
4
5        for(int x : nums) {
6            map.put(x, map.getOrDefault(x, 0) + 1);
7        }
8        return map.entrySet()
9                .stream()
10                .sorted((a, b) -> b.getValue() - a.getValue()) // sort giảm dần
11                .limit(k)
12                .mapToInt(Map.Entry::getKey)
13                .toArray();
14    }
15}