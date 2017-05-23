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
        if (root == null) return;
        Queue<TreeLinkNode> Q = new LinkedList<>();
        Q.add(root);
        while (!Q.isEmpty()) {
            int size = Q.size();
            TreeLinkNode temp = null;
            for (int i = 0; i < size; ++i) {
                TreeLinkNode head = Q.poll();
                if (temp != null) temp.next = head;
                temp = head;
                if (head.left != null) Q.add(head.left);
                if (head.right != null) Q.add(head.right);
            }
        }
    }
}
