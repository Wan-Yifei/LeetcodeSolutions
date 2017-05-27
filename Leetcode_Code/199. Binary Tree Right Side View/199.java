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
    public List<Integer> rightSideView(TreeNode root) {
        rightSideView_dfs(root, 0);
        return result;
    }

    private List<Integer> result = new ArrayList<>();

    private void rightSideView_dfs(TreeNode root, int layer) {
        if (root == null) return;
        if (result.size() <= layer) result.add(root.val);
        rightSideView_dfs(root.right, layer + 1);
        rightSideView_dfs(root.left, layer + 1);
    }
}
