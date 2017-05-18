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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root != null)
            zigzagLevelOrder_dfs(root, 0);
        return result;
    }

    private void zigzagLevelOrder_dfs(TreeNode root, int layer) {
        if (root == null) return;
        if (result.size() <= layer) {
            result.add(new ArrayList<>());
        }
        if (layer % 2 == 0) result.get(layer).add(root.val);
        else result.get(layer).add(0, root.val);
        zigzagLevelOrder_dfs(root.left, layer + 1);
        zigzagLevelOrder_dfs(root.right, layer + 1);
    }
}
