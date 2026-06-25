// Last updated: 6/25/2026, 10:58:57 PM
1import java.util.HashSet;
2
3class Solution {
4    public int[] intersection(int[] nums1, int[] nums2) {
5        HashSet<Integer> set1 = new HashSet<>();
6        HashSet<Integer> intersection = new HashSet<>();
7    
8        for (int num : nums1) {
9            set1.add(num);
10        }
11        
12        for (int num : nums2) {
13            if (set1.contains(num)) {
14                intersection.add(num); 
15            }
16        }
17        
18        int[] result = new int[intersection.size()];
19        int index = 0;
20        for (int num : intersection) {
21            result[index++] = num;
22        }
23        
24        return result;
25    }
26}