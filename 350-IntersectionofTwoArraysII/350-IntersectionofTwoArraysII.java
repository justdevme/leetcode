// Last updated: 6/29/2026, 10:54:08 PM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        // Ưu tiên để nums1 là mảng có độ dài nhỏ hơn nhằm tiết kiệm bộ nhớ cho HashMap
4        if (nums1.length > nums2.length) {
5            return intersect(nums2, nums1);
6        }
7        
8        HashMap<Integer, Integer> map = new HashMap<>();
9        // Đếm số lần xuất hiện của các phần tử trong nums1
10        for (int num : nums1) {
11            map.put(num, map.getOrDefault(num, 0) + 1);
12        }
13        
14        List<Integer> resultList = new ArrayList<>();
15        // Duyệt qua nums2 để tìm phần tử chung
16        for (int num : nums2) {
17            if (map.containsKey(num) && map.get(num) > 0) {
18                resultList.add(num);
19                map.put(num, map.get(num) - 1); // Giảm tần suất đi 1
20            }
21        }
22        
23        // Chuyển List sang mảng int[] để trả về đúng định dạng
24        int[] result = new int[resultList.size()];
25        for (int i = 0; i < resultList.size(); i++) {
26            result[i] = resultList.get(i);
27        }
28        
29        return result;
30    }
31}