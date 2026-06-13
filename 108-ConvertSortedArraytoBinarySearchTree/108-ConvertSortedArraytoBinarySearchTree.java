// Last updated: 6/13/2026, 7:12:38 PM
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
17    public TreeNode sortedArrayToBST(int[] nums) {
18        return constructBST(nums, 0, nums.length - 1);
19    }
20    private TreeNode constructBST(int[] nums, int left, int right) {
21        // Điều kiện dừng đệ quy: Khi chỉ số trái vượt quá chỉ số phải
22        if (left > right) {
23            return null;
24        }
25        
26        // Tìm vị trí chính giữa để đảm bảo cây cân bằng
27        int mid = left + (right - left) / 2;
28        
29        // Tạo nút gốc cho cây con hiện tại
30        TreeNode root = new TreeNode(nums[mid]);
31        
32        // Đệ quy xây dựng cây con bên trái và bên phải
33        root.left = constructBST(nums, left, mid - 1);
34        root.right = constructBST(nums, mid + 1, right);
35        
36        return root;
37    }
38
39}