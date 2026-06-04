// Last updated: 6/4/2026, 3:30:14 PM
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
17    public int minDepth(TreeNode root) {
18        // bottom-up
19        // base case: Cây rỗng thì độ sâu bằng 0
20        if (root == null) return 0;
21
22        // gọi đệ quy xuống dưới để lấy kết quả từ các con 
23        int left = minDepth(root.left);
24        int right = minDepth(root.right);
25
26        // Edge case: nếu 1 trong 2 con bị null -> lấy độ sâu của bên không null và cộng 1
27        if (root.left == null) return right + 1;
28        if (root.right == null) return left + 1;
29
30        return Math.min(left, right) + 1;
31    }
32}