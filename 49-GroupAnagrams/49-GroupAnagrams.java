// Last updated: 2/25/2026, 10:25:18 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> map = new HashMap<>();
4
5        for (String s : strs) {
6            char[] charArray = s.toCharArray();
7            Arrays.sort(charArray);
8            String str = new String(charArray);
9            map.computeIfAbsent(str, k -> new ArrayList<>()).add(s);
10        }
11        return new ArrayList<>(map.values());
12    }
13}