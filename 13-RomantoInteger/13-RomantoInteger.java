// Last updated: 6/15/2026, 11:19:52 PM
1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public int romanToInt(String s) {
6        // Khởi tạo bảng tra cứu giá trị La Mã
7        Map<Character, Integer> romanMap = new HashMap<>();
8        romanMap.put('I', 1);
9        romanMap.put('V', 5);
10        romanMap.put('X', 10);
11        romanMap.put('L', 50);
12        romanMap.put('C', 100);
13        romanMap.put('D', 500);
14        romanMap.put('M', 1000);
15        
16        int total = 0;
17        int n = s.length();
18        
19        for (int i = 0; i < n; i++) {
20            // Lấy giá trị của ký tự hiện tại
21            int currentVal = romanMap.get(s.charAt(i));
22            
23            // Nếu ký tự hiện tại nhỏ hơn ký tự tiếp theo
24            if (i < n - 1 && currentVal < romanMap.get(s.charAt(i + 1))) {
25                total -= currentVal;
26            } else {
27                total += currentVal;
28            }
29        }
30        
31        return total;
32    }
33}