// Last updated: 4/16/2026, 8:53:59 AM
1class Solution {
2    public String countAndSay(int n) {
3        String s = "1";
4      
5        
6        for (int i = 1; i < n; i++){
7            StringBuilder next = new StringBuilder();
8            int count = 1;
9            for (int j = 0; j < s.length() - 1; j++) {
10                if (s.charAt(j) == s.charAt(j + 1)) {
11                    count++;
12                } else {
13                    next.append(String.valueOf(count));
14                    next.append(s.charAt(j));
15                    count = 1; 
16                }
17            }
18            next.append(count);
19            next.append(s.charAt(s.length() - 1));
20            s = next.toString();
21        }
22        return s;
23    }
24}