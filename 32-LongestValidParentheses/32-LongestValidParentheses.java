// Last updated: 5/21/2026, 11:37:28 PM
1class Solution {
2    public int longestValidParentheses(String s) {
3        Stack<Integer> stack = new Stack<>();
4        stack.push(-1);
5
6        int maxLen = 0;
7
8        for (int i = 0; i < s.length(); i++) {
9            char c = s.charAt(i);
10
11            if (c == '(') {
12                stack.push(i);
13            } else {
14                stack.pop();
15
16                if (stack.isEmpty()) {
17                    stack.push(i);
18                } else {
19                    maxLen = Math.max(maxLen, i - stack.peek());
20                }
21            }
22        }
23        return maxLen;
24    }
25}