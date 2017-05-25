/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        sumNumbers_dfs(root, 0);
        return sum;
    }

    private int sum = 0;

    private void sumNumbers_dfs(TreeNode root, int num) {
        if (root.left == null && root.right == null) {
            sum += 10 * num + root.val;
            return;
        }
        num = 10 * num + root.val;
        if (root.left != null) sumNumbers_dfs(root.left, num);
        if (root.right != null) sumNumbers_dfs(root.right, num);
    }
}
