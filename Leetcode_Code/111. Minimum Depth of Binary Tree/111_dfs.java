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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        minDepth_dfs(root, 1);
        return maxDepth;
    }

    private int maxDepth = Integer.MAX_VALUE;

    private void minDepth_dfs(TreeNode root, int depth) {
        if (root.left == null && root.right == null)
            maxDepth = Math.min(maxDepth, depth);
        else if (depth <= maxDepth) {
            if (root.left != null) minDepth_dfs(root.left, depth + 1);
            if (root.right != null) minDepth_dfs(root.right, depth + 1);
        }
    }
}
