// Last updated: 5/18/2026, 11:09:35 AM
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3       
4        Queue<int[]> queue = new LinkedList<>();
5        queue.add(new int[]{sr, sc});
6        int originalColor = image[sr][sc];
7        if (originalColor == color) return image;
8        image[sr][sc] = color;
9        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
10        while (!queue.isEmpty()){
11            int[] node = queue.poll();
12            int row = node[0];
13            int col = node[1];
14            for (int[] dir : dirs) {
15
16                int newRow = row + dir[0];
17                int newCol = col + dir[1];
18                if (newRow >= 0 && newRow < image.length && newCol >= 0 && newCol < image[0].length && image[newRow][newCol] == originalColor) {
19                    image[newRow][newCol] = color;
20                    queue.add(new int[]{newRow, newCol});
21                }
22            }
23        }
24        return image;
25    }
26}