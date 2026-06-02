// Last updated: 6/2/2026, 10:20:58 PM
1class Solution {
2    List<Integer> tmp = new ArrayList<>();
3    List<List<Integer>> res = new ArrayList<>();
4    boolean[] used = new boolean[8];
5    public List<List<Integer>> permuteUnique(int[] nums) {
6        Arrays.sort(nums);
7        backtrack(nums);
8        return res;
9    }
10    void backtrack (int[] nums) {
11        if (tmp.size() == nums.length) {
12            res.add(new ArrayList<>(tmp));
13            return;
14        }
15        for (int i = 0; i < nums.length; i++) {
16            if (used[i]) continue;
17            if(i > 0 && !used[i - 1] && nums[i] == nums[i-1]) continue;
18            tmp.add(nums[i]);
19            used[i] = true;
20            backtrack(nums);
21            tmp.remove(tmp.size() - 1);
22            used[i] = false;
23        }
24    }
25}