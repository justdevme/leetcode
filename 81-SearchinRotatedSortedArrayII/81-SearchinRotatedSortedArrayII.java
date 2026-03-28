// Last updated: 3/28/2026, 6:36:26 PM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int idx = -1;
4        for (int i = 0; i < nums.length - 1; i++) {
5            if (nums[i] > nums[i + 1]){
6                idx = i;
7                break;
8            }
9        }
10        if (idx == -1) {
11            idx = nums.length - 1;
12        }
13        int[] arr1 = Arrays.copyOfRange(nums, idx + 1, nums.length);
14        int[] arr2 = Arrays.copyOfRange(nums, 0, idx + 1);
15        int[] combine = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
16        int l = 0, r = combine.length - 1;
17        while (l <= r) {
18            int mid = (l + r) / 2;
19            if (combine[mid] == target) {
20                return true;
21            } else if (combine[mid] < target) {
22                l = mid + 1;
23            } else {
24                r = mid - 1;
25            }
26        }
27        return false;
28    }
29}