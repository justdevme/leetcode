// Last updated: 6/2/2026, 9:34:19 PM
1class Solution {
2    List<Integer> tmp = new ArrayList<>();
3    List<List<Integer>> res = new ArrayList<>();
4    
5    public List<List<Integer>> combinationSum3(int k, int n) {
6        
7        backtrack(1, n, k);
8        return res; 
9    }
10    int sum = 0;
11    void backtrack(int start, int n, int k) {
12        
13        if (tmp.size() == k && sum == n) {
14            res.add(new ArrayList<>(tmp));
15            return;
16        }
17        
18        for (int i = start; i <= 9; i++) {
19            if( n - i < 0) {
20                continue;
21            } 
22            tmp.add(i);
23            sum += i;
24            backtrack(i + 1, n, k);
25            tmp.remove(tmp.size() - 1);
26            sum -= i;
27        }
28    }
29}