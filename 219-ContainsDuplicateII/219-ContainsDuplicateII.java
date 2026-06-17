// Last updated: 6/17/2026, 9:02:08 PM
1import java.util.*;
2
3class Solution {
4    public boolean containsNearbyDuplicate(int[] nums, int k) {
5        Map<Integer, Integer> map = new HashMap<>();
6
7        for (int i = 0; i < nums.length; i++) {
8            int x = nums[i];
9
10            if (map.containsKey(x)) {
11                int prevIndex = map.get(x);
12
13                if (i - prevIndex <= k) {
14                    return true;
15                }
16            }
17
18            map.put(x, i);
19        }
20
21        return false;
22    }
23}