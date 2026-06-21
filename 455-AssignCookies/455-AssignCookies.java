// Last updated: 6/21/2026, 10:44:40 PM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        int i = 0;
6        int j = 0;
7        int res = 0;
8        while(i < g.length && j < s.length) {
9            if (s[j] >= g[i]) {
10                res += 1;
11                i++;
12                j++;
13            } else {
14                j++;
15            }
16        }
17        return res;
18    }
19}