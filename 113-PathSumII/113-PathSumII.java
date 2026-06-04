// Last updated: 6/4/2026, 4:24:27 PM
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
17    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
18        List<List<Integer>> result = new ArrayList<>();
19        List<Integer> currentPath = new ArrayList<>();
20        
21        // Gọi hàm đệ quy top-down bắt đầu từ gốc
22        dfs(root, targetSum, currentPath, result);
23        
24        return result;
25    }
26
27    private void dfs(TreeNode node, int remainingSum, List<Integer> currentPath, List<List<Integer>> result) {
28        if (node == null) {
29            return;
30        }
31        //b1: Choose - thêm node hiện tại vào đường đi
32        currentPath.add(node.val);
33
34        //b2: kiểm tra xem đã chạm node lá chưa
35        if(node.left == null && node.right == null) {
36            // nếu chạm thì kiểm tra xem remain = target chưa
37            if(remainingSum == node.val) {
38                result.add(new ArrayList<>(currentPath));
39            }
40        } else {
41            // nếu chưa phải thì tiếp tục đi xuống
42            dfs(node.left, remainingSum - node.val, currentPath, result);
43            dfs(node.right, remainingSum - node.val, currentPath, result);
44        }
45        //b3: quay lui
46        currentPath.remove(currentPath.size() - 1);
47    }
48}