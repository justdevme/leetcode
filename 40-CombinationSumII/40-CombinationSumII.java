// Last updated: 3/22/2026, 5:06:09 PM
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
3        List<List<Integer>> res = new ArrayList<>();
4        Arrays.sort(candidates);
5        backtrack(candidates, target, 0, new ArrayList<>(), res);
6        return res;
7    }
8
9    private void backtrack(int[] candidates, int remain, int start, List<Integer> path, List<List<Integer>> res) {
10        if (remain == 0) {
11            res.add(new ArrayList<>(path));
12            return;
13        }
14
15        for (int i = start; i < candidates.length; i++) {
16            if (i > start && candidates[i] == candidates[i - 1]) {
17                continue;
18            }
19
20            if (candidates[i] > remain) {
21                break;
22            }
23
24            path.add(candidates[i]);
25            backtrack(candidates, remain - candidates[i], i + 1, path, res);
26            path.remove(path.size() - 1);
27        }
28    }
29}