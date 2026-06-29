// Last updated: 6/29/2026, 10:54:26 PM
1class Solution {
2    public int thirdMax(int[] nums) {
3        // Dùng đối tượng Integer để có thể gán giá trị null ban đầu
4        Integer first = null;
5        Integer second = null;
6        Integer third = null;
7        
8        for (Integer num : nums) {
9            // Bỏ qua nếu số hiện tại đã trùng với một trong top 3 số lớn nhất
10            if (num.equals(first) || num.equals(second) || num.equals(third)) {
11                continue;
12            }
13            
14            // Cập nhật vị trí tương ứng
15            if (first == null || num > first) {
16                third = second;
17                second = first;
18                first = num;
19            } else if (second == null || num > second) {
20                third = second;
21                second = num;
22            } else if (third == null || num > third) {
23                third = num;
24            }
25        }
26        
27        // Nếu số lớn thứ 3 không tồn tại, trả về số lớn nhất (first)
28        return third == null ? first : third;
29    }
30}