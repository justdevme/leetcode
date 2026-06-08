// Last updated: 6/8/2026, 10:28:34 PM
1class Solution {
2    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
3        if (n==1) return List.of(0);
4        List<List<Integer>> graph = new ArrayList<>();
5        int[] indeg = new int[n];
6        int k = n;
7        // 1. Khởi tạo graph
8        for (int i = 0; i < n; i++) {
9            graph.add(new ArrayList<>());
10        }
11
12        // 2. Build graph và tính indegree
13        for (int[] edge : edges) {
14            int u = edge[0];
15            int v = edge[1];
16
17            graph.get(u).add(v);
18            graph.get(v).add(u);
19            indeg[v]++;
20            indeg[u]++;
21        }
22        // 3. Đưa node có indegree = 0 vào queue
23        Queue<Integer> queue = new LinkedList<>();
24
25        for (int i = 0; i < n; i++) {
26            if (indeg[i] == 1) {
27                queue.offer(i);
28            }
29        }
30         // 4. Kahn Algorithm
31        List<Integer> order = new ArrayList<>();
32
33        while (n > 2) {
34            int size = queue.size();
35            n -= size;
36            for (int i = 0; i < size; i++) {
37                int u = queue.poll();
38                for (int v : graph.get(u)) {
39                    indeg[v]--;
40
41                    if (indeg[v] == 1) {
42                        queue.offer(v);
43                    }
44                }
45            }
46        }
47        return new ArrayList<>(queue);
48    }
49}