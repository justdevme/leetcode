// Last updated: 4/16/2026, 9:28:54 PM
1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3        Map<Integer, Integer> maps = new HashMap<>();
4        for (int x : nums) {
5            maps.put(x, maps.getOrDefault(x, 0) + 1);
6        }
7
8        List<Integer> result = new ArrayList<>();
9        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
10            if (entry.getValue() == 2) {
11                result.add(entry.getKey());
12            }
13        }
14        return result;
15    }
16}