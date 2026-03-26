// Last updated: 3/26/2026, 4:28:09 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        backtrack(0, nums, new ArrayList<>(), res);
5        return res;
6    }
7    private void backtrack(int start, int[] nums, List<Integer> path, List<List<Integer>> res) {
8        res.add(new ArrayList<>(path));
9
10        for(int i = start; i < nums.length; i++) {
11            path.add(nums[i]);
12            backtrack(i + 1, nums, path, res);
13            path.remove(path.size() - 1);
14        }
15    }
16}