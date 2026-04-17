// Last updated: 4/17/2026, 10:17:05 AM
1class Solution {
2    public List<List<Integer>> findSubsequences(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        List<Integer> path = new ArrayList<>();
5        backtrack(nums, 0, path, res);
6        return res;
7    }
8
9    private void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
10        if(path.size() >= 2) {
11            result.add(new ArrayList<>(path));
12        }
13        Set<Integer> used = new HashSet<>();
14
15        for (int i = start; i < nums.length; i++) {
16            if(used.contains(nums[i])) continue;
17
18            if(!path.isEmpty() && nums[i] < path.get(path.size() - 1)) continue;
19            
20            used.add(nums[i]);
21            path.add(nums[i]);
22
23            backtrack(nums, i + 1, path, result);
24
25            path.remove(path.size() - 1);
26        }
27    }
28}