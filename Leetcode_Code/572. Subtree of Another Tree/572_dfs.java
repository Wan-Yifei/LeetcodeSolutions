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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null)
            return false;
        targetHead(s, t);
        return hasSame;
    }

    private boolean hasSame = false;

    private void targetHead(TreeNode s, TreeNode t) {
        if (s == null)
            return;
        if (s.val == t.val)
            if (isSame(s, t))
                hasSame = true;
        if (!hasSame) {
            targetHead(s.left, t);
            targetHead(s.right, t);
        }
    }

    private boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null)
            return true;
        if (s == null || t == null)
            return false;
        else if (s.val == t.val) {
            return isSame(s.left, t.left) && isSame(s.right, t.right);
        } else
            return false;
    }
}
