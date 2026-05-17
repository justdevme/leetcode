// Last updated: 5/17/2026, 9:58:39 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] answer = new int[n];
5
6        // Bước 1: answer[i] lưu tích tất cả phần tử bên trái i
7        answer[0] = 1;
8
9        for (int i = 1; i < n; i++) {
10            answer[i] = answer[i - 1] * nums[i - 1];
11        }
12
13        // Bước 2: nhân thêm tích tất cả phần tử bên phải i
14        int rightProduct = 1;
15
16        for (int i = n - 1; i >= 0; i--) {
17            answer[i] = answer[i] * rightProduct;
18            rightProduct = rightProduct * nums[i];
19        }
20
21        return answer;
22    }
23}