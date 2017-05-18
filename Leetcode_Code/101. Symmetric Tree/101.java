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
    private boolean result = true;

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        isSymmetric_dfs(root.left, root.right);
        return result;
    }

    private void isSymmetric_dfs(TreeNode l, TreeNode r) {
        if (l == null && r == null) return;
        if (l == null || r == null) {
            result = false;
            return;
        }
        if (l.val == r.val) {
            isSymmetric_dfs(l.left, r.right);
            isSymmetric_dfs(l.right, r.left);
        } else result = false;
    }
}
