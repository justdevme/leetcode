// Last updated: 3/10/2026, 12:56:09 AM
1class Solution {
2    public boolean isValid(String s) {
3        
4        Stack<Character> stack = new Stack<>();
5        HashMap<Character, Character> map = new HashMap<>();
6        char[] tmp = s.toCharArray();
7        if (tmp[0] == ')' || tmp[0] == ']' || tmp[0] == '}') return false;
8        map.put('(', ')');
9        map.put('{','}');
10        map.put('[',']');
11        int k = 0;
12        for (char x : s.toCharArray()) {
13            
14            if (x == '(' || x =='{' || x == '[') {
15                stack.push(x);
16                k += 1;
17            } else if(stack.size() > 0 && x == map.get(stack.peek())) {
18                stack.pop();
19            } else if (stack.size() > 0 && x != map.get(stack.peek())) {
20                return false;
21            } else if (stack.isEmpty()) return false;
22        }
23        if (stack.size() == 0 && k > 0 && k == s.length()/2) return true;
24        else return false;  
25    }
26}