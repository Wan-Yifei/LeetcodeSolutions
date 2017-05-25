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
    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        findMaxPathSum(root);
        return result;
    }

    private int result = Integer.MIN_VALUE;

    private int findMaxPathSum(TreeNode root) {
        if (root == null) return 0;
        int l = findMaxPathSum(root.left);
        int r = findMaxPathSum(root.right);
        int top = Math.max(0, Math.max(l, r)) + root.val;
        result = Math.max(result, Math.max(top, l + r + root.val));
        return top;
    }
}
