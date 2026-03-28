// Last updated: 3/29/2026, 1:26:57 AM
1class Solution {
2    public int smallestDivisor(int[] nums, int threshold) {
3        int l = 1;
4        int r = Arrays.stream(nums).max().getAsInt();
5        int res = 1;
6
7        while (l <= r) {
8            int mid = (l + r) / 2;
9            int sum = 0;
10            for (int x : nums) {
11                if (x % mid == 0){
12                    sum += (x / mid);
13                } else {
14                    sum += (x / mid) + 1;
15                }
16            }
17            if (sum <= threshold) {
18                res = mid;
19                r = mid - 1; // mid nhỏ -> kq ra số lớn
20            } else {
21                l = mid + 1; // mid lớn -> kq ra số nhỏ
22            }
23        }
24        return res;
25    }
26}