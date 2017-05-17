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
    public List<TreeNode> generateTrees(int n) {
        if (n < 1) {
            return new ArrayList<>();
        }
        return generateSubTrees(1, n);
    }

    private List<TreeNode> generateSubTrees(int start, int end) {
        List<TreeNode> result = new ArrayList<>();
        if (end < start) {
            result.add(null);
            return result;
        }
        for (int mid = start; mid <= end; mid++) {
            for (TreeNode SubL : generateSubTrees(start, mid - 1)) {
                for (TreeNode SubR : generateSubTrees(mid + 1, end)) {
                    TreeNode root = new TreeNode(mid);
                    root.left = SubL;
                    root.right = SubR;
                    result.add(root);
                }
            }
        }
        return result;
    }
}
