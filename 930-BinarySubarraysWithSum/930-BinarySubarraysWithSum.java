// Last updated: 3/24/2026, 11:46:40 PM
1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        Map <Integer, Integer> count = new HashMap<>();
4        int sum = 0, res = 0;
5        
6        count.put(0, 1);
7
8        for (int i = 0; i < nums.length; i++) {
9            sum += nums[i];
10            res += count.getOrDefault(sum - goal, 0); // kiểm tra xem chọn điểm bắt đầu tại đâu khi kết thúc tại i.
11            count.put(sum, count.getOrDefault(sum, 0) + 1);
12        }
13
14        return res;
15    }
16}