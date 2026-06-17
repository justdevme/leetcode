// Last updated: 6/17/2026, 9:02:24 PM
1import java.util.*;
2
3class Solution {
4    public List<String> summaryRanges(int[] nums) {
5        List<String> result = new ArrayList<>();
6
7        if (nums.length == 0) {
8            return result;
9        }
10
11        int start = nums[0];
12
13        for (int i = 1; i < nums.length; i++) {
14            // Nếu không còn liên tiếp nữa
15            if (nums[i] != nums[i - 1] + 1) {
16                int end = nums[i - 1];
17
18                if (start == end) {
19                    result.add(String.valueOf(start));
20                } else {
21                    result.add(start + "->" + end);
22                }
23
24                start = nums[i];
25            }
26        }
27
28        // Thêm đoạn cuối cùng
29        int end = nums[nums.length - 1];
30
31        if (start == end) {
32            result.add(String.valueOf(start));
33        } else {
34            result.add(start + "->" + end);
35        }
36
37        return result;
38    }
39}