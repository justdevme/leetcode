// Last updated: 3/21/2026, 6:47:29 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        List<Integer> sumR = new ArrayList<>();
4        List<Integer> sumL = new ArrayList<>();
5        if(nums.length == 1) return 0;
6        sumL.add(0);
7        sumR.add(0);
8        for (int i = 1; i < nums.length; i++) {
9            sumL.add(sumL.get(sumL.size()-1) + nums[i - 1]);
10        }
11        for (int i = nums.length - 2; i >= 0; i--) {
12            sumR.add(sumR.get(sumR.size() - 1) + nums[i + 1]);
13        }
14        Collections.reverse(sumR);
15
16        for(int i = 0; i < nums.length; i++) {
17            if (sumL.get(i).equals(sumR.get(i))) {
18                return i;
19            }
20        }
21        return -1;
22        
23    }
24}