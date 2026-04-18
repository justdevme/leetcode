// Last updated: 4/18/2026, 10:33:37 AM
1class Solution {
2    public int findLUSlength(String[] strs) {
3        int res = -1;
4        for (int i = 0; i < strs.length; i++) {
5            boolean isUncommon = true;
6            for (int j = 0; j < strs.length; j++) {
7                if (i == j) continue;
8                if (isSubsequence(strs[i], strs[j])) {
9                    isUncommon = false;
10                    break;
11                }
12                
13                }
14                if (isUncommon){
15                    res = Math.max(res, strs[i].length());
16            }
17        }
18        return res;
19    }
20
21    private boolean isSubsequence(String a, String b) {
22        int i = 0, j = 0;
23        while (i < a.length() && j < b.length()) {
24            if(a.charAt(i) == b.charAt(j)) {
25                i++;
26            }
27            j++;
28        }
29        return i == a.length();
30    }
31}