// Last updated: 7/2/2026, 8:34:37 PM
1import java.util.HashSet;
2import java.util.Set;
3
4public class Solution {
5    public String longestNiceSubstring(String s) {
6        // Base case: Chuỗi quá ngắn không thể tạo thành cặp hoa-thường
7        if (s.length() < 2) {
8            return "";
9        }
10        
11        // Lưu các ký tự xuất hiện trong chuỗi vào HashSet để tra cứu nhanh O(1)
12        Set<Character> set = new HashSet<>();
13        for (char c : s.toCharArray()) {
14            set.add(c);
15        }
16        
17        // Duyệt qua từng ký tự để tìm vị trí chia (Pivot)
18        for (int i = 0; i < s.length(); i++) {
19            char c = s.charAt(i);
20            
21            // Nếu có cả ký tự viết hoa và viết thường, ký tự này hợp lệ -> bỏ qua
22            if (set.contains(Character.toLowerCase(c)) && set.contains(Character.toUpperCase(c))) {
23                continue;
24            }
25            
26            // Nếu không hợp lệ, "Chia" chuỗi làm 2 nửa tại vị trí i và "Trị" (đệ quy)
27            String leftSub = longestNiceSubstring(s.substring(0, i));
28            String rightSub = longestNiceSubstring(s.substring(i + 1));
29            
30            // Bước Kết hợp (Combine): Chọn chuỗi có độ dài lớn hơn
31            // Nếu độ dài bằng nhau, đề bài yêu cầu lấy chuỗi xuất hiện trước (chính là leftSub)
32            return leftSub.length() >= rightSub.length() ? leftSub : rightSub;
33        }
34        
35        // Base case: Nếu chạy hết vòng lặp mà không bị chia cắt, chứng tỏ chuỗi hiện tại đã "Nice"
36        return s;
37    }
38}