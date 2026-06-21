// Last updated: 6/21/2026, 10:20:02 PM
1class Solution {
2    public int longestPalindrome(String s) {
3        //1. Đếm tần suất
4        Map<Character, Integer> charCountMap = new HashMap<>();
5        for (char c : s.toCharArray()) {
6            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
7        }
8        //2. Với mỗi kí tự, cộng dồn vào kết quả chẵn
9        int res = 0;
10        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
11            if(entry.getValue() % 2 == 0) {
12                res += entry.getValue();
13                int newValue = 0;
14                entry.setValue(newValue);
15            } else if (entry.getValue() % 2 != 0 && entry.getValue() > 1) {
16                res += entry.getValue() - 1;
17                int newValue = 1;
18                entry.setValue(newValue);                
19            }
20        }
21        //3. Nếu có ít nhất 1 kí tự có tần suất lẻ -> cộng thêm 1 vào kết quả
22        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
23            if (entry.getValue() % 2 != 0) {
24                res += 1;
25                return res;
26            }
27        }
28        return res;
29    }
30}