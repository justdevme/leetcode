// Last updated: 4/14/2026, 1:45:53 PM
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        // tạo adjacency list
4         List<List<Integer>> graph = new ArrayList<>();
5        
6        for (int i = 0; i < n; i++) {
7            graph.add(new ArrayList<>());
8        }
9        // add các cạnh vào graph
10        for (int[] edge : edges) {
11            int u = edge[0];
12            int v = edge[1];
13            graph.get(u).add(v);
14            graph.get(v).add(u);
15        }
16        // tạo visited
17        boolean[] visited = new boolean[n];
18
19        return dfs(graph, visited, source, destination);
20    }
21
22    private boolean dfs(List<List<Integer>> graph, boolean[] visited, int node, int destination) {
23        if (node == destination) {
24            return true;
25        }
26
27        visited[node] = true;
28
29        for (int neighbor : graph.get(node)) {
30            if (!visited[neighbor]) {
31                if (dfs(graph, visited, neighbor, destination)) {
32                    return true;
33                }
34            }
35        }
36
37        return false;
38    }
39
40}