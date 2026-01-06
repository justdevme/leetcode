// Last updated: 1/7/2026, 12:36:24 AM
class Solution {
    public int myAtoi(String s) {
         // 1. Bỏ khoảng trắng ở đầu
        int i = 0;
        int n = s.length();
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        // Nếu chuỗi rỗng sau khi bỏ space
        if (i == n) {
            return 0;
        }
         // 2. Xử lý dấu
        int sign = 1;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            if (s.charAt(i) == '-'){
                sign = -1;
               
            }
             i += 1;
        }
       
        // 3. Đọc số
        long num = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            num = num * 10 + digit;
            //4. check tràn số
            if (sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }
        return (int) (sign * num);
        
    }
}