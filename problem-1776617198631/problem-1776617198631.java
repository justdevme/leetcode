// Last updated: 4/19/2026, 11:46:38 PM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int left = 1;
4        int right = nums.length - 1; // n
5
6        while (left < right) {
7            int mid = left + (right - left) / 2;
8
9            int count = 0;
10            for (int num : nums) {
11                if (num <= mid) {
12                    count++;
13                }
14            }
15
16            if (count > mid) { // mid -> có đúng mid số
17                right = mid;
18            } else {
19                left = mid + 1;
20            }
21        }
22
23        return left;
24    }
25}