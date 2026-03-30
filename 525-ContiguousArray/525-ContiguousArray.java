// Last updated: 3/30/2026, 8:07:13 PM
1class Solution {
2    public int findMaxLength(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        map.put(0, -1); // cực kỳ quan trọng
5
6        int sum = 0;
7        int maxLen = 0;
8
9        for (int i = 0; i < nums.length; i++) {
10            if (nums[i] == 1) sum += 1;
11            else sum -= 1;
12
13            if (map.containsKey(sum)) {
14                maxLen = Math.max(maxLen, i - map.get(sum));
15            } else {
16                map.put(sum, i);
17            }
18        }
19
20        return maxLen;
21    }
22}