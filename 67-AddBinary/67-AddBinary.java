// Last updated: 7/2/2026, 9:37:18 PM
1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder sb = new StringBuilder();
4        int i = a.length() - 1; // Con trỏ cuối chuỗi a
5        int j = b.length() - 1; // Con trỏ cuối chuỗi b
6        int carry = 0;          // Biến nhớ
7
8        // Chạy vòng lặp khi vẫn còn ký tự để cộng HOẶC vẫn còn số nhớ
9        while (i >= 0 || j >= 0 || carry > 0) {
10            int sum = carry; // Lấy số nhớ từ bước trước vào tổng hiện tại
11
12            // Nếu chuỗi a vẫn còn ký tự, cộng giá trị vào sum
13            if (i >= 0) {
14                sum += a.charAt(i) - '0'; // Chuyển ký tự '0'/'1' thành số 0/1
15                i--;
16            }
17
18            // Nếu chuỗi b vẫn còn ký tự, cộng giá trị vào sum
19            if (j >= 0) {
20                sum += b.charAt(j) - '0';
21                j--;
22            }
23
24            // Trong hệ nhị phân:
25            sb.append(sum % 2); // Giá trị ghi lại là phần dư của tổng cho 2
26            carry = sum / 2;    // Số nhớ tiếp theo là phần nguyên của tổng chia 2
27        }
28
29        // Vì ta cộng từ phải qua trái nên chuỗi đang bị ngược -> cần reverse lại
30        return sb.reverse().toString();
31    }
32}