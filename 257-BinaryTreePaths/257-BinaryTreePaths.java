// Last updated: 6/1/2026, 12:30:59 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<String> binaryTreePaths(TreeNode root) {
18        List<String> result = new ArrayList<>();
19
20        if (root == null) {
21            return result;
22        }
23
24        dfs(root, "", result);
25        return result;
26    }
27
28    private void dfs(TreeNode node, String path, List<String> result) {
29        if (node == null) {
30            return;
31        }
32
33        // Nếu path đang rỗng, nghĩa là đang ở root
34        if (path.length() == 0) {
35            path = String.valueOf(node.val);
36        } else {
37            path = path + "->" + node.val;
38        }
39
40        // Nếu là leaf node thì thêm path vào result
41        if (node.left == null && node.right == null) {
42            result.add(path);
43            return;
44        }
45
46        // Đi tiếp sang trái và phải
47        dfs(node.left, path, result);
48        dfs(node.right, path, result);
49    }
50}