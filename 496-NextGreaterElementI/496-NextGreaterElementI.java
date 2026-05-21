// Last updated: 5/21/2026, 11:12:53 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        Map<Integer, Integer> map = new HashMap<>();
4        Stack<Integer> stack = new Stack<>();
5
6        for (int num : nums2) {
7            while (!stack.isEmpty() && num > stack.peek()) {
8                map.put(stack.pop(), num);
9            }
10
11            stack.push(num);
12        }
13        int[] res = new int[nums1.length];
14
15        for (int i = 0; i < nums1.length; i++) {
16            res[i] = map.getOrDefault(nums1[i], -1);
17        }
18        return res;
19    }
20}