// Last updated: 4/16/2026, 10:30:27 AM
1class Solution {
2    public char findKthBit(int n, int k) {
3        String s = gen(n);
4        return s.charAt(k-1);
5    }
6
7    private String gen (int n) {
8        if (n == 1) return "0";
9        String x = gen (n-1);
10        return x + "1" + reverse(inverse(x));
11    }
12
13    private String inverse(String s) {
14        StringBuilder tmp = new StringBuilder();
15        for (int i = 0; i < s.length(); i++) {
16            if(s.charAt(i) == '0') {
17                tmp.append(1);
18            } else {
19                tmp.append(0);
20            }
21        }
22        return tmp.toString();
23    }
24
25    private String reverse(String s) {
26        StringBuilder tmp = new StringBuilder();
27        for (int i = s.length() - 1; i >= 0; i--) {
28            tmp.append(s.charAt(i));
29        }
30        return tmp.toString();
31    }
32}