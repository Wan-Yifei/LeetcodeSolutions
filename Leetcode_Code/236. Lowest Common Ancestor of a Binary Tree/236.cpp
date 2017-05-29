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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lowestCommonAncestor_dfs(root, p, q);
        return result;
    }

    private boolean lowestCommonAncestor_dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (!terminate) {
            if (root == null) return false;
            boolean bl = lowestCommonAncestor_dfs(root.left, p, q);
            boolean br = lowestCommonAncestor_dfs(root.right, p, q);
            boolean now = root == p || root == q;
            if ((bl && br) || (bl && now) || (br && now)) {
                result = root;
                terminate = true;
            }
            return now || bl || br;
        }
        return false;
    }

    private TreeNode result = null;
    private boolean terminate = false;
}
