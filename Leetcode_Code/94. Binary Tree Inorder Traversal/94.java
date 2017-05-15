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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> stack = new ArrayList<>();
        if (root == null) return stack;
        treeDFS(root, stack);
        return stack;
    }

    private void treeDFS(TreeNode head, List<Integer> stack) {
        if (head.left != null) {
            treeDFS(head.left, stack);
        }
        stack.add(head.val);
        if (head.right != null) {
            treeDFS(head.right, stack);
        }
    }
}
