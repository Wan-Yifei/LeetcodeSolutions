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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);
        while (!Q.isEmpty()) {
            int size = Q.size();
            List<Integer> layerElement = new ArrayList<>();
            for (int i = 0; i < size; ++i) {
                TreeNode head = Q.poll();
                layerElement.add(head.val);
                if (head.left != null) Q.add(head.left);
                if (head.right != null) Q.add(head.right);
            }
            result.add(0, layerElement);
        }
        return result;
    }
}
