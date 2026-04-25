// Last updated: 4/25/2026, 9:50:58 AM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        int l = 0, r = 0;
4        int count = 0;
5        int product = 1;
6        while (r < nums.length) {
7            product *= nums[r];
8
9            while(product >= k && l <= r) {
10                product /= nums[l];
11                l++;
12            }
13            count += r - l + 1;
14            r++;
15            
16        }
17        return count;
18    }
19}