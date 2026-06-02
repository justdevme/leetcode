// Last updated: 6/2/2026, 9:56:37 PM
1class Solution {
2    List<Integer> tmp = new ArrayList<>();
3    List<List<Integer>> res = new ArrayList<>();
4    public List<List<Integer>> subsetsWithDup(int[] nums) {
5        Arrays.sort(nums);
6        backtrack(0, nums);
7        return res;
8    }
9    void backtrack (int start, int[] nums) {
10        
11        res.add(new ArrayList<>(tmp));
12          
13        for (int i = start; i < nums.length; i++) {
14            if(i > start && nums[i] == nums[i - 1]) continue;
15            tmp.add(nums[i]);
16            backtrack(i + 1, nums);
17            tmp.remove(tmp.size() - 1);
18        }
19    }
20}