// Last updated: 5/16/2026, 8:20:31 PM
1class Solution {
2    public int[] plusOne(int[] digits) {
3        int n = digits.length;
4        
5        
6        for (int i = n - 1; i >= 0; i--) {
7           
8            if (digits[i] < 9) {
9                digits[i]++;
10                return digits;
11            }
12            
13            digits[i] = 0;
14        }
15        
16        int[] newDigits = new int[n + 1];
17        newDigits[0] = 1; 
18        
19        return newDigits;
20    }
21}