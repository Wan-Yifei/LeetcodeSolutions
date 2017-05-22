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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        hasPathSum_dfs(root, sum);
        return result;
    }

    private boolean result = false;

    private void hasPathSum_dfs(TreeNode root, int sum) {
        if (root.left == null && root.right == null) {
            if (sum == root.val) result = true;
            return;
        }
        if (!result) {
            if (root.left != null) hasPathSum_dfs(root.left, sum - root.val);
            if (root.right != null) hasPathSum_dfs(root.right, sum - root.val);
        }
    }
}
