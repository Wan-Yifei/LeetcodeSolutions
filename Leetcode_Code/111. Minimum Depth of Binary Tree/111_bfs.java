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
        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);
        int depth = 1;
        while (!Q.isEmpty()) {
            int size = Q.size();
            for (int i = 0; i < size; ++i) {
                TreeNode head = Q.poll();
                if (head.left == null && head.right == null) return depth;
                if (head.left != null) Q.add(head.left);
                if (head.right != null) Q.add(head.right);
            }
            depth++;
        }
        return depth;
    }
}
