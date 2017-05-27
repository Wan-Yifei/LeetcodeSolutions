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
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null & root.right == null) return 1;
        root.val = 1;
        TreeNode head = root, leftMostNode = root, rightLeftMostNode = root;
        /*target the left most node*/
        if (head.left != null) {
            leftMostNode = head.left;
            leftMostNode.val = head.val * 2;
            while (leftMostNode.left != null) {
                int value = leftMostNode.val;
                leftMostNode = leftMostNode.left;
                leftMostNode.val = value * 2;
            }
        }
        while (head != null) {
            /*check the left most leaf, and right most leaf*/
            if (head.right != null) {
                rightLeftMostNode = head.right;
                rightLeftMostNode.val = head.val * 2 + 1;
                while (rightLeftMostNode.left != null) {
                    int value = rightLeftMostNode.val;
                    rightLeftMostNode = rightLeftMostNode.left;
                    rightLeftMostNode.val = value * 2;
                }
            }
            /*go to branches*/
            if (leftMostNode.val < rightLeftMostNode.val) {
                total = rightLeftMostNode.val;
                head = head.right;
                leftMostNode = rightLeftMostNode;
            } else {
                total = leftMostNode.val;
                head = head.left;
            }
        }
        return total;
    }

    private int total = 0;
}
