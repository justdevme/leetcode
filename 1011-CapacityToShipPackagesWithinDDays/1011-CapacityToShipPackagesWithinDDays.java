// Last updated: 3/29/2026, 12:58:00 AM
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int l = 0;
4        int r = 0;
5        for (int x : weights) {
6            r += x;
7            l = Math.max(l, x);
8        }
9        int ans = r;
10        while (l <= r) {
11            long count_days = 1;
12            int mid = (l + r) / 2;
13            int tmp = mid;
14            for (int x : weights) {
15                if (x <= tmp) {
16                    tmp -= x;
17                } else{
18                    tmp = mid - x; // sang ngày mới thì package mà > tmp cũ phải được chở
19                    count_days += 1;
20                }
21            }
22            if (count_days <= days) {
23                ans = mid;
24                r = mid - 1;
25            } else {
26                l = mid + 1;
27            }
28        }
29        return ans;
30    }
31}