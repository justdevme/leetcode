// Last updated: 6/18/2026, 10:40:22 PM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        if (s.length() != t.length()) return false;
4        
5        int[] mapS = new int[256];
6        int[] mapT = new int[256];
7        
8        for (int i = 0; i < s.length(); i++) {
9            char charS = s.charAt(i);
10            char charT = t.charAt(i);
11            
12            // Nếu vị trí xuất hiện lịch sử không khớp nhau -> sai quy tắc 1-1
13            if (mapS[charS] != mapT[charT]) {
14                return false;
15            }
16            
17            // Lưu vị trí hiện tại (i + 1 để tránh trùng với giá trị mặc định là 0)
18            mapS[charS] = i + 1;
19            mapT[charT] = i + 1;
20        }
21        
22        return true;
23    }
24}