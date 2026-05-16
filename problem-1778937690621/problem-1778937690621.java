// Last updated: 5/16/2026, 8:21:30 PM
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<List<Integer>> generate(int numRows) {
6        List<List<Integer>> triangle = new ArrayList<>();
7
8        for (int i = 0; i < numRows; i++) {
9            List<Integer> row = new ArrayList<>();
10            
11            for (int j = 0; j <= i; j++) {
12                if (j == 0 || j == i) {
13                    row.add(1);
14                } else {
15                    int leftAbove = triangle.get(i - 1).get(j - 1);
16                    int rightAbove = triangle.get(i - 1).get(j);
17                    row.add(leftAbove + rightAbove);
18                }
19            }
20            
21            triangle.add(row);
22        }
23
24        return triangle;
25    }
26}