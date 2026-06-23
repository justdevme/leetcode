// Last updated: 6/23/2026, 11:47:47 PM
1class Solution {
2    public boolean validPalindrome(String s) {
3        int left = 0;
4        int right = s.length() - 1;
5        
6        while (left < right) {
7            if (s.charAt(left) != s.charAt(right)) {
8                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
9            }
10            left++;
11            right--;
12        }
13        
14        return true;
15    }
16    
17    private boolean isPalindrome(String s, int l, int r) {
18        while (l < r) {
19            if (s.charAt(l) != s.charAt(r)) {
20                return false;
21            }
22            l++;
23            r--;
24        }
25        return true;
26    }
27}