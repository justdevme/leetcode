// Last updated: 4/6/2026, 10:58:15 PM
1class Solution {
2    public String reverseWords(String s1) {
3        List<String> words = new ArrayList<>();
4        String[] temp = s1.trim().split("\\s+");
5        StringBuilder s = new StringBuilder();
6        for (int i = temp.length - 1; i >= 0; i--) {
7            s.append(temp[i]);
8            s.append(" ");
9        }
10        s.deleteCharAt(s.length() - 1);
11        return s.toString();
12        
13    }
14}