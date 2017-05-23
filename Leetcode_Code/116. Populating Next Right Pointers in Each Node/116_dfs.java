/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        connect_dfs(root, 0);
    }

    private List<TreeLinkNode> heads = new ArrayList<>();

    private void connect_dfs(TreeLinkNode root, int layer) {
        if (root == null) return;
        if (heads.size() <= layer) heads.add(root);
        else {
            heads.get(layer).next = root;
            heads.set(layer, root);
        }

        connect_dfs(root.left, layer + 1);
        connect_dfs(root.right, layer + 1);
    }
}
