// Last updated: 3/1/2026, 12:37:46 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        String tmp = s.replaceAll("[^a-zA-Z0-9]", "");
4        String tmp1 = tmp.toLowerCase();
5        int l = 0, r = tmp1.length() - 1;
6
7        while (l < r) {
8            if (tmp1.charAt(l) != tmp1.charAt(r)) return false;
9            else{
10                l++;
11                r--;
12            }
13        }
14        return true;
15    }
16}