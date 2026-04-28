// Last updated: 4/28/2026, 3:40:13 PM
1class Solution {
2    public int compress(char[] chars) {
3        int read = 0;
4        int write = 0;
5
6        while (read < chars.length) {
7            char current = chars[read];
8            int count = 0;
9
10            // Đếm xem current xuất hiện liên tiếp bao nhiêu lần
11            while (read < chars.length && chars[read] == current) {
12                read++;
13                count++;
14            }
15
16            // Ghi ký tự hiện tại
17            chars[write] = current;
18            write++;
19
20            // Nếu count > 1 thì ghi thêm số lượng
21            if (count > 1) {
22                String countStr = String.valueOf(count);
23
24                for (int i = 0; i < countStr.length(); i++) {
25                    chars[write] = countStr.charAt(i);
26                    write++;
27                }
28            }
29        }
30
31        return write;
32    }
33}