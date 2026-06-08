// Last updated: 6/8/2026, 5:38:39 PM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> graph = new ArrayList<>();
4
5        for (int i = 0; i < numCourses; i++) {
6            graph.add(new ArrayList<>());
7        }
8
9        for (int[] pre : prerequisites) {
10            int course = pre[0];
11            int prerequisite = pre[1];
12
13            // Muốn học course thì phải học prerequisite trước
14            // nên cạnh là prerequisite -> course
15            graph.get(prerequisite).add(course);
16        }
17
18        int[] state = new int[numCourses];
19
20        for (int i = 0; i < numCourses; i++) {
21            if (state[i] == 0) {
22                if (!dfs(i, graph, state)) {
23                    return false;
24                }
25            }
26        }
27
28        return true;
29    }
30
31    private boolean dfs(int node, List<List<Integer>> graph, int[] state) {
32        if (state[node] == 1) {
33            return false; // gặp lại node đang duyệt => có cycle
34        }
35
36        if (state[node] == 2) {
37            return true; // node này đã xử lý xong rồi
38        }
39
40        state[node] = 1;
41
42        for (int next : graph.get(node)) {
43            if (!dfs(next, graph, state)) {
44                return false;
45            }
46        }
47
48        state[node] = 2;
49        return true;
50    }
51}