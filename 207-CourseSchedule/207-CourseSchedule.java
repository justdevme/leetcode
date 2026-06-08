// Last updated: 6/8/2026, 9:41:06 PM
1class Solution {
2    public int[] findOrder(int n, int[][] edges) {
3        List<List<Integer>> graph = new ArrayList<>();
4        int[] indeg = new int[n];
5
6        // 1. Khởi tạo graph
7        for (int i = 0; i < n; i++) {
8            graph.add(new ArrayList<>());
9        }
10
11        // 2. Build graph và tính indegree
12        for (int[] edge : edges) {
13            int v = edge[0];
14            int u = edge[1];
15
16            graph.get(u).add(v);
17            indeg[v]++;
18        }
19
20        // 3. Đưa node có indegree = 0 vào queue
21        Queue<Integer> queue = new LinkedList<>();
22
23        for (int i = 0; i < n; i++) {
24            if (indeg[i] == 0) {
25                queue.offer(i);
26            }
27        }
28
29        // 4. Kahn Algorithm
30        List<Integer> order = new ArrayList<>();
31
32        while (!queue.isEmpty()) {
33            int u = queue.poll();
34            order.add(u);
35
36            for (int v : graph.get(u)) {
37                indeg[v]--;
38
39                if (indeg[v] == 0) {
40                    queue.offer(v);
41                }
42            }
43        }
44        // 5. Check cycle
45        if (order.size() != n) {
46            return new int[]{};
47        }
48
49        return order.stream().mapToInt(Integer::intValue).toArray();
50    }
51}