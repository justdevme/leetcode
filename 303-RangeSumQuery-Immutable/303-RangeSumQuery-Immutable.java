// Last updated: 6/20/2026, 7:43:16 PM
1class NumArray {
2    // Mảng lưu trữ tổng cộng dồn
3    private int[] prefix;
4
5    public NumArray(int[] nums) {
6        int n = nums.length;
7        // Khởi tạo mảng prefix có kích thước n + 1
8        prefix = new int[n + 1];
9        
10        // prefix[0] mặc định bằng 0
11        for (int i = 1; i <= n; i++) {
12            prefix[i] = prefix[i - 1] + nums[i - 1];
13        }
14    }
15    
16    public int sumRange(int left, int right) {
17        // Tổng đoạn từ left đến right bằng tổng từ 0 đến right trừ đi tổng từ 0 đến left - 1
18        return prefix[right + 1] - prefix[left];
19    }
20}
21
22