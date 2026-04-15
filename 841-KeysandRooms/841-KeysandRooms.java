// Last updated: 4/15/2026, 8:44:21 PM
1class Solution {
2    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
3        int n = rooms.size();
4        boolean[] visited = new boolean[n];
5        Stack <Integer> stack = new Stack<>();
6
7        stack.push(0);
8        visited[0] = true;
9
10        while (!stack.isEmpty()) {
11            int room = stack.pop();
12            for (int key : rooms.get(room)) {
13                if(!visited[key]) {
14                    visited[key] = true;
15                    stack.push(key);
16                }
17            }
18        }
19        for (boolean v : visited) {
20            if (!v) return false;
21        }
22        return true;
23    }
24}