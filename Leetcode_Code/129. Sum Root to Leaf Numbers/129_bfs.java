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
    public int sumNumbers(TreeNode root) {
        int sum = 0;
        if (root == null) return sum;
        Queue<TreeNode> Q = new LinkedList<>();
        Queue<Integer> Qi = new LinkedList<>();
        Q.add(root);
        Qi.add(root.val);
        while (!Q.isEmpty()) {
            int size = Q.size();
            for (int i = 0; i < size; ++i) {
                TreeNode head = Q.poll();
                int num = Qi.poll();
                if (head.left != null) {
                    Q.add(head.left);
                    Qi.add(10 * num + head.left.val);
                }
                if (head.right != null) {
                    Q.add(head.right);
                    Qi.add(10 * num + head.right.val);
                }
                if (head.left == null && head.right == null) sum += num;
            }
        }
        return sum;
    }
}
