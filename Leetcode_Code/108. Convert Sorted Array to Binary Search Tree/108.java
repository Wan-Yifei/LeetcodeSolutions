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
    public TreeNode sortedArrayToBST(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for (int x : nums) {
            arr.add(x);
        }
        return sortedArrayToBST_dfs(arr, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST_dfs(List<Integer> nums, int start, int end) {
        if (end < start) return null;
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums.get(mid));
        root.left = sortedArrayToBST_dfs(nums, start, mid - 1);
        root.right = sortedArrayToBST_dfs(nums, mid + 1, end);
        return root;
    }
}
