// Last updated: 4/18/2026, 12:46:36 PM
1class Solution {
2    public int longestSubstring(String s, int k) {
3        return helper(s, k);
4    }
5    private int helper (String s, int k) {
6        if (s.length() < k) return 0;
7
8        int[] freq = new int[26];
9        for (char c : s.toCharArray()) {
10            freq[c - 'a']++;
11        }
12
13        for (int i = 0; i < s.length(); i++) {
14            if (freq[s.charAt(i) - 'a'] < k) {
15                String leftPart = s.substring(0, i);
16                String rightPart = s.substring(i + 1);
17                return Math.max(helper(leftPart, k), helper(rightPart, k));
18            }
19        }
20
21        return s.length();
22    }
23}