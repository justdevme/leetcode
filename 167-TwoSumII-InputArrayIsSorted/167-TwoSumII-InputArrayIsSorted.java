// Last updated: 3/1/2026, 12:55:27 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int[] index = new int [2];
4        int l = 0;
5        int r = numbers.length - 1;
6        while (l < r) {
7            int sum = numbers[l] + numbers[r];
8            if (sum == target) {
9                index[0] = l + 1;
10                index[1] = r + 1;
11                return index;
12            }
13            else if (sum > target) {
14                r--;
15            } else {
16                l++;
17            }
18        }
19        return index;
20    }
21}