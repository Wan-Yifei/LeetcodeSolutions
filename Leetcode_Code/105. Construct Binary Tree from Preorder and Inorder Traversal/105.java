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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 && preorder.length != inorder.length) return null;
        List<Integer> Preorder = new ArrayList<>(), Inorder = new ArrayList<>();
        for (int i = 0; i < preorder.length; ++i) {
            Preorder.add(preorder[i]);
            Inorder.add(inorder[i]);
        }
        return buildTree_dfs(Preorder, Inorder, 0, preorder.length);
    }

    private int Pnow = 0;

    private TreeNode buildTree_dfs(List<Integer> preorder, List<Integer> inorder, int Istart, int Iend) {
        if (Istart > Iend || Pnow >= inorder.size()) return null;
        TreeNode root = new TreeNode(preorder.get(Pnow));
        int mid = inorder.indexOf(preorder.get(Pnow));
        Pnow++;
        root.left = buildTree_dfs(preorder, inorder, Istart, mid - 1);
        root.right = buildTree_dfs(preorder, inorder, mid + 1, Iend);
        return root;
    }
}
