// Last updated: 6/8/2026, 9:53:40 PM
1class Solution {
2    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
3        List<List<Integer>> graph = new ArrayList<>();
4        int[] indeg = new int[n];
5
6        // 1. Khởi tạo graph
7        for (int i = 0; i < n; i++) {
8            graph.add(new ArrayList<>());
9        }
10
11        // 2. Build graph và tính indegree
12        for (List<Integer> edge : edges) {
13            int u = edge.get(0);
14            int v = edge.get(1);
15
16            graph.get(u).add(v);
17            indeg[v]++;
18        }
19        List<Integer> res = new ArrayList<>();
20        for (int i = 0; i < indeg.length; i++) {
21            if ( indeg[i] == 0) {
22                res.add(i);
23            }
24        }
25        return res;
26    }
27}