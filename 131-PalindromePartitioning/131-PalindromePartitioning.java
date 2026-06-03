// Last updated: 6/3/2026, 11:15:21 PM
1
2class Solution {
3    public List<List<String>> partition(String s) {
4        List<List<String>> res = new ArrayList<>();
5        List<String> path = new ArrayList<>();
6
7        backtrack(s, 0, path, res);
8
9        return res;
10    }
11
12    private void backtrack(String s, int start, List<String> path, List<List<String>> res) {
13        // Nếu đã đi hết chuỗi
14        if (start == s.length()) {
15            res.add(new ArrayList<>(path));
16            return;
17        }
18
19        // Thử cắt từ start đến end
20        for (int end = start; end < s.length(); end++) {
21            if (isPalindrome(s, start, end)) {
22                String sub = s.substring(start, end + 1);
23
24                path.add(sub);                 // chọn
25                backtrack(s, end + 1, path, res); // đi tiếp
26                path.remove(path.size() - 1);   // bỏ chọn
27            }
28        }
29    }
30
31    private boolean isPalindrome(String s, int left, int right) {
32        while (left < right) {
33            if (s.charAt(left) != s.charAt(right)) {
34                return false;
35            }
36            left++;
37            right--;
38        }
39        return true;
40    }
41}
42
43