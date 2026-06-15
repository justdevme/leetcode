// Last updated: 6/15/2026, 11:20:11 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        int nHaystack = haystack.length();
4        int nNeedle = needle.length();
5        
6        // Nếu chuỗi cần tìm dài hơn chuỗi gốc thì không bao giờ khớp
7        if (nNeedle > nHaystack) {
8            return -1;
9        }
10        
11        // Duyệt qua các vị trí có khả năng khớp trong haystack
12        for (int i = 0; i <= nHaystack - nNeedle; i++) {
13            // Trích xuất chuỗi con có độ dài bằng needle bắt đầu từ i
14            String sub = haystack.substring(i, i + nNeedle);
15            
16            // So sánh nội dung chuỗi
17            if (sub.equals(needle)) {
18                return i;
19            }
20        }
21        
22        return -1;
23    }
24}