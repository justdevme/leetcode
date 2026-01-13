// Last updated: 1/13/2026, 3:47:30 PM
1class Solution {
2    public int sumOfUnique(int[] nums) {
3       
4        Map <Integer, Integer> counts = new HashMap<>(); 
5        for(int x : nums) {
6            counts.put(x, counts.getOrDefault(x, 0) + 1);
7        }
8        int sum = 0;
9        for (int x : counts.keySet()) {
10            if (counts.get(x) == 1){
11                sum += x;
12            }
13        }
14        return sum;
15    }
16}