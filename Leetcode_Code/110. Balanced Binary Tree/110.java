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
    public boolean isBalanced(TreeNode root) {
        isBalanced_dfs(root);
        return test;
    }

    private boolean test = true;

    private int isBalanced_dfs(TreeNode root) {
        if (root == null) return 0;
        if (test) {
            int h1 = isBalanced_dfs(root.left);
            int h2 = isBalanced_dfs(root.right);
            if (Math.abs(h1 - h2) > 1) test = false;
            return Math.max(h1, h2) + 1;
        }
        return 0;
    }
}
