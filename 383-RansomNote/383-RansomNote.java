// Last updated: 1/13/2026, 6:29:58 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map <String, List<String>> m = new HashMap<>();
4        for (String s : strs) {
5            String temp = sorted(s);
6            m.putIfAbsent(temp, new ArrayList<>());
7            m.get(temp).add(s);
8        }
9        return new ArrayList<>(m.values());
10
11    }
12
13    public String sorted (String s) {
14        char[] arr = s.toCharArray();
15        Arrays.sort(arr);
16        String s1 = new String (arr);
17        return s1;
18    }
19}