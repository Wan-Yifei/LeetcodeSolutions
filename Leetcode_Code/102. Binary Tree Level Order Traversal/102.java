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
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root != null)
            levelOrder_dfs(root, 0);
        return result;
    }

    private void levelOrder_dfs(TreeNode root, int layer) {
        if (root == null) return;
        if (result.size() < layer + 1) {
            result.add(new ArrayList<>());
        }
        result.get(layer).add(root.val);
        levelOrder_dfs(root.left, layer + 1);
        levelOrder_dfs(root.right, layer + 1);
    }
}
