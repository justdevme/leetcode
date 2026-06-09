// Last updated: 6/9/2026, 3:23:49 PM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
4
5        LinkedList<int[]> merged = new LinkedList<>();
6
7        for (int[] interval : intervals) {
8            // Nếu merged trống hoặc khoảng hiện tại không giao với khoảng cuối cùng trong merged
9            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
10                merged.add(interval);
11            } else {
12                // Nếu giao nhau, cập nhật lại điểm kết thúc lớn nhất
13                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
14            }
15        }
16
17        return merged.toArray(new int[merged.size()][]);
18    }
19}