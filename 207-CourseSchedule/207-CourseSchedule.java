// Last updated: 6/8/2026, 9:03:39 PM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> graph = new ArrayList<>();
4        int[] indeg = new int[numCourses];
5
6        for (int i = 0; i < numCourses; i++) {
7            graph.add(new ArrayList<>());
8        }
9
10        for (int[] p : prerequisites) {
11            int course = p[0];
12            int prereq = p[1];
13
14            graph.get(prereq).add(course);
15            indeg[course]++;
16        }
17        Queue<Integer> queue = new LinkedList<>();
18        for (int i = 0; i < numCourses; i++) {
19            if (indeg[i] == 0) {
20                queue.offer(i);
21            }
22        }
23
24        int count = 0;
25
26        while (!queue.isEmpty()) {
27            int u = queue.poll();
28            count++;
29
30            for (int v : graph.get(u)) {
31                indeg[v]--;
32
33                if (indeg[v] == 0) {
34                    queue.offer(v);
35                }
36            }
37        }
38
39        return count == numCourses;
40    }
41}