# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None


class Solution:
    def find_nearest_right(self, node):
        while node.left:
            node = node.left
        return node

    def deleteNode(self, root, key):
        """
        :type root: TreeNode
        :type key: int
        :rtype: TreeNode
        """
        # reach the end
        if root is None:
            return None
        # go to the position first
        if root.val > key:
            root.left = self.deleteNode(root.left, key)
        elif root.val < key:
            root.right = self.deleteNode(root.right, key)
        # if find the node
        else:
            # if no branch
            if root.left is None and root.right is None:
                return None
            # if contains only one branch, connect to other branch
            if root.left is None:
                return root.right
            if root.right is None:
                return root.left
            # contain 2 branches
            else:
                min_node = self.find_nearest_right(root.right)
                root.val = min_node.val
                root.right = self.deleteNode(root.right, root.val)
        return root
