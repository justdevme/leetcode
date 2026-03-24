// Last updated: 3/24/2026, 11:29:09 AM
1class Solution {
2    public String frequencySort(String s) {
3        Map<Character, Integer> map = new HashMap<>();
4
5        for (char x : s.toCharArray()){
6            map.put(x, map.getOrDefault(x, 0) + 1);
7        }
8
9        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
10        list.sort((a, b) -> b.getValue() - a.getValue());
11        StringBuilder sb = new StringBuilder();
12        for (Map.Entry<Character, Integer> entry : list) {
13            sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
14        }
15
16        return sb.toString();
17
18    }
19}