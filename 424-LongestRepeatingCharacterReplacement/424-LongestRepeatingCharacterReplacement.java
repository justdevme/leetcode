// Last updated: 4/12/2026, 4:10:29 PM
1class Solution {
2    public int characterReplacement(String s, int k) {
3        HashMap<Character, Integer> freqs = new HashMap<>();
4        int highestFreq = 0;
5        int maxLen = 0;
6        int l = 0, r = 0;
7        while (r < s.length()) {
8            char ch = s.charAt(r);
9            freqs.put(ch, freqs.getOrDefault(ch, 0) + 1);
10            highestFreq = Math.max(highestFreq, freqs.get(ch));
11
12            int numCharsToReplace = (r - l + 1) - highestFreq;
13            if (numCharsToReplace > k) {
14                char leftChar = s.charAt(l);
15                freqs.put(leftChar, freqs.get(leftChar) - 1);
16                l++;
17            }
18            maxLen = r - l + 1;
19
20            r++;
21        }
22        return maxLen;
23    }
24}