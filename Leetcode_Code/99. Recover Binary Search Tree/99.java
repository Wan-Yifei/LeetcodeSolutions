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
    private TreeNode lastNode, first, second;

    public void recoverTree(TreeNode root) {
        lastNode = first = second = null;
        recoverTree_dfs(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void recoverTree_dfs(TreeNode root) {
        if (root == null) return;
        recoverTree_dfs(root.left);
        if (lastNode != null && lastNode.val >= root.val) {
            if (first == null) first = lastNode;
            if (first != null) second = root;
        }
        lastNode = root;
        recoverTree_dfs(root.right);
    }
}
