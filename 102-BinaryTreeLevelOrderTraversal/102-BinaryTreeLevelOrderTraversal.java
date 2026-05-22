// Last updated: 5/22/2026, 3:02:12 PM
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        //1. edge case
19        if (root == null) return new ArrayList<>();
20        //2. khởi tạo queue
21        Queue<TreeNode> queue = new LinkedList<>();
22        List<List<Integer>> res = new ArrayList<>();
23        queue.offer(root);
24        //3. vòng lặp ngoài: còn node trong queue
25        while (!queue.isEmpty()){
26            //3a. lấy size của tầng hiện tại
27            int size = queue.size();
28            //3b. vòng lặp trong: lặp size lần
29            List<Integer> level = new ArrayList<>();
30            for (int i = 0; i < size; i++) {
31                // - dequeue, thêm vào level
32                TreeNode node = queue.poll();
33                level.add(node.val);
34                // - push children
35                if (node.left != null) queue.offer(node.left);
36                if (node.right != null) queue.offer(node.right);
37            }
38            //3c. append level vào result
39            res.add(level);
40        }
41            
42        //4. return result
43        return res;
44    }
45}