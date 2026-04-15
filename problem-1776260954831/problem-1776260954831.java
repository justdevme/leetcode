// Last updated: 4/15/2026, 8:49:14 PM
1class Solution {
2    public String intToRoman(int num) {
3        int[]    values  = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
4        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
5
6        StringBuilder result = new StringBuilder();
7
8        for (int i = 0; i < values.length; i++) {
9            
10            while (num >= values[i]) {
11                result.append(symbols[i]);
12                num -= values[i];
13            }
14        }
15
16        return result.toString();
17    }
18}