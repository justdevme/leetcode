// Last updated: 4/16/2026, 9:57:38 PM
1class Solution {
2    public int numberOfBoomerangs(int[][] points) {
3        int result = 0;
4        for (int i = 0; i < points.length; i++) {
5            Map<Integer, Integer> freq = new HashMap<>();
6            for (int j = 0; j < points.length; j++) {
7                if (i == j) continue;   // bỏ qua chính nó
8                int dist = getDist(points[i], points[j]);
9                freq.put(dist, freq.getOrDefault(dist, 0) + 1);
10            }
11            for (int n : freq.values()) {
12                result += n * (n - 1);
13            }
14        }
15        return result;
16    }
17
18    private int getDist(int[] a, int[] b) {
19        int dx = a[0] - b[0];
20        int dy = a[1] - b[1];
21        return dx * dx + dy * dy;
22    }
23}