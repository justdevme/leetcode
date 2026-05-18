// Last updated: 5/18/2026, 10:55:41 AM
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        Queue<int[]> queue = new LinkedList<>();
4        boolean[][] visited = new boolean[image.length][image[0].length];
5        queue.add(new int[]{sr, sc});
6        visited[sr][sc] = true;
7        int originalColor = image[sr][sc];
8        image[sr][sc] = color;
9        while(!queue.isEmpty()){
10            int[] node = queue.poll();
11            int row = node[0];
12            int col = node[1];
13            if (row > 0 && !visited[row - 1][col] && image[row - 1][col] == originalColor) {
14                image[row - 1][col] = color;
15                int[] tmp = {row - 1, col};
16                visited[row - 1][col] = true;
17                queue.add(tmp);
18            }
19            if (row < image.length - 1 && !visited[row + 1][col] && image[row + 1][col] == originalColor) {
20                image[row + 1][col] = color;
21                int[] tmp = {row + 1, col};
22                visited[row + 1][col] = true;
23                queue.add(tmp);
24            }
25            if (col > 0 && !visited[row][col - 1] &&image[row][col - 1] == originalColor) {
26                image[row][col - 1] = color;
27                int[] tmp = {row, col - 1};
28                visited[row][col - 1] = true;
29                queue.add(tmp);
30            }
31            if (col < image[0].length - 1 && !visited[row][col + 1] && image[row][col + 1] == originalColor) {
32                image[row][col + 1] = color;
33                int[] tmp = {row, col + 1};
34                visited[row][col + 1] = true;
35                queue.add(tmp);
36            }
37        }
38        return image;
39    }
40}