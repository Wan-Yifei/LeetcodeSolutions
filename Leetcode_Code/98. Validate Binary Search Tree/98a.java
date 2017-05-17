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
    private TreeNode lastNode = null;
    private boolean bool = true;

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        isValidBST(root.left);
        if (lastNode != null && lastNode.val >= root.val) bool = false;
        else {
            lastNode = root;
            isValidBST(root.right);
        }
        return bool;
    }
}
