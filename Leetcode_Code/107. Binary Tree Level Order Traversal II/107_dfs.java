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
        if (root != null) {
            levelOrderBottom_dfs(root, 0);
            Collections.reverse(result);
        }
        return result;
    }

    private void levelOrderBottom_dfs(TreeNode root, int layer) {
        if (root == null) return;
        if (result.size() <= layer) result.add(new ArrayList<>());
        result.get(layer).add(root.val);
        levelOrderBottom_dfs(root.left, layer + 1);
        levelOrderBottom_dfs(root.right, layer + 1);
    }

    private List<List<Integer>> result = new ArrayList<>();
}
