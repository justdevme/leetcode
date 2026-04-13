// Last updated: 4/13/2026, 11:05:11 PM
1class Solution {
2    public int minimumTotal(List<List<Integer>> triangle) {
3        for (int i = triangle.size() - 2; i >= 0; i--) {
4            for (int j = 0;j < triangle.get(i).size(); j++) {
5                int down = triangle.get(i + 1).get(j);
6                int diagonal = triangle.get(i + 1).get(j + 1);
7
8                int current = triangle.get(i).get(j);
9
10                triangle.get(i).set(j, current + Math.min(down, diagonal));
11            }
12        }
13        return triangle.get(0).get(0);
14    }
15}