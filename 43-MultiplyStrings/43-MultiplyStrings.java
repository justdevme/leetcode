// Last updated: 4/7/2026, 11:53:21 PM
1class Solution {
2    public String multiply(String num1, String num2) {
3        if (num1.equals("0") || num2.equals("0")) return "0";
4
5        int m = num1.length();
6        int n = num2.length();
7        int[] res = new int[m + n];
8
9        for (int i = m - 1; i >= 0; i--) {
10            for (int j = n - 1; j >= 0; j--) {
11                int d1 = num1.charAt(i) - '0';
12                int d2 = num2.charAt(j) - '0';
13
14                int mul = d1 * d2;
15
16                int p1 = i + j;
17                int p2 = i + j + 1;
18
19                int sum = mul + res[p2];
20
21                res[p2] = sum % 10;
22                res[p1] += sum / 10;
23            }
24        }
25
26        StringBuilder sb = new StringBuilder();
27        for (int num : res) {
28            if (!(sb.length() == 0 && num == 0)) {
29                sb.append(num);
30            }
31        }
32
33        return sb.toString();
34    }
35}