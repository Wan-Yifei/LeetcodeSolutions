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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return result;
        Stack<Integer> stack = new Stack<>();
        pathSum_dfs(root, stack, sum);
        return result;
    }

    private List<List<Integer>> result = new ArrayList<>();

    private void pathSum_dfs(TreeNode root, Stack<Integer> stack, int sum) {
        if (root.left == null & root.right == null) {
            if (sum == root.val) {
                stack.add(root.val);
                List<Integer> object = new ArrayList<>(stack);
                result.add(object);
                stack.pop();
            }
        }
        stack.add(root.val);
        if (root.left != null) pathSum_dfs(root.left, stack, sum - root.val);
        if (root.right != null) pathSum_dfs(root.right, stack, sum - root.val);
        stack.pop();
    }
}
