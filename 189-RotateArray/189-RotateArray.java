// Last updated: 4/28/2026, 3:47:26 PM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4
5        k = k % n;
6
7        reverse(nums, 0, n - 1);
8
9        reverse(nums, 0, k - 1);
10
11        reverse(nums, k, n - 1);
12    }
13    private void reverse(int[] nums, int left, int right) {
14        while (left < right) {
15            int temp = nums[left];
16            nums[left] = nums[right];
17            nums[right] = temp;
18
19            left++;
20            right--;
21        }
22    }
23}