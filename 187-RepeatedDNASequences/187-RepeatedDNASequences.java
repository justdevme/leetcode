// Last updated: 4/18/2026, 12:04:54 PM
1class Solution {
2    public List<String> findRepeatedDnaSequences(String s) {
3        // return s with length = 10 + xuat hien > 1 lan
4        if (s.length() < 10) return new ArrayList<>();
5        int left = 0, right = 9;
6        List<String> res = new ArrayList<>();
7        Map<String, Integer> freq = new HashMap<>();
8        while (right < s.length()) {
9            
10            if (right - left + 1 == 10) {
11                String tmp = s.substring(left, right + 1);
12                freq.put(tmp, freq.getOrDefault(tmp, 0) + 1);
13                left++;
14            }
15            right++;
16        }
17        for(String key : freq.keySet()) {
18            if (freq.get(key) >= 2) {
19                res.add(key);
20            }
21        }
22        return res;
23
24    }
25}