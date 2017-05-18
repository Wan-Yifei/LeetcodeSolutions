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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        isSameTree_dfs(p, q);
        return result;
    }

    private void isSameTree_dfs(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            if (p != q) {
                result = false;
                return;
            }
            return;
        }
        if (p.val == q.val) {
            isSameTree_dfs(p.left, q.left);
            isSameTree_dfs(p.right, q.right);
        } else result = false;
    }
}
