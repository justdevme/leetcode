// Last updated: 4/18/2026, 2:18:40 PM
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        List<Integer> res = new ArrayList<>();
4        if (p.length() > s.length()) return res;
5        int k = p.length();
6        
7        int l = 0, r = 0;
8        int[] pCount = new int[26];
9        int[] window = new int[26];
10        for (char c : p.toCharArray()) {
11            pCount[c - 'a']++;
12        }
13        while (r < s.length()) {
14            window[s.charAt(r) - 'a']++;
15            if (r - l + 1 == k) {
16                if(Arrays.equals(window, pCount)) {
17                    res.add(l);
18                }
19                window[s.charAt(l) - 'a']--;
20                l++;
21            }
22            r++;
23        }
24        return res;
25
26    }
27  
28}