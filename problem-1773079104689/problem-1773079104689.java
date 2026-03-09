// Last updated: 3/10/2026, 12:58:24 AM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4        HashMap<Character, Character> map = new HashMap<>();
5
6        map.put('(', ')');
7        map.put('{', '}');
8        map.put('[', ']');
9
10        for (char x : s.toCharArray()) {
11            if (x == '(' || x == '{' || x == '[') {
12                stack.push(x);
13            } else {
14                if (stack.isEmpty()) return false;
15                if (x != map.get(stack.peek())) return false;
16                stack.pop();
17            }
18        }
19
20        return stack.isEmpty();
21    }
22}