// Last updated: 5/20/2026, 10:11:34 PM
1class Solution {
2    public String reverseVowels(String s) {
3        char[] arr = s.toCharArray();
4
5        int left = 0;
6        int right = arr.length - 1;
7
8        while (left < right) {
9            while (left < right && !isVowel(arr[left])) {
10                left++;
11            }
12
13            while (left < right && !isVowel(arr[right])) {
14                right--;
15            }
16
17            char temp = arr[left];
18            arr[left] = arr[right];
19            arr[right] = temp;
20
21            left++;
22            right--;
23        }
24
25        return new String(arr);
26    }
27
28    private boolean isVowel(char c) {
29        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
30            || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
31    }
32}