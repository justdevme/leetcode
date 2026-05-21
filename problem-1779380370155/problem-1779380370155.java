// Last updated: 5/21/2026, 11:19:30 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int n = nums.length;
4        int[] res = new int[n];
5        Arrays.fill(res, -1);
6
7        Stack<Integer> stack = new Stack<>();
8
9        for (int i = 0; i < 2 * n; i++) {
10            int num = nums[i % n];
11
12            while (!stack.isEmpty() && num > nums[stack.peek()]) {
13                int index = stack.pop();
14                res[index] = num;
15            }
16
17            if (i < n) {
18                stack.push(i);
19            }
20        }
21        return res;
22    }
23}