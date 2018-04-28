# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def pathSum(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        if not root:
            return []
        lst = []
        temp = []

        def dfs(node, total):
            nonlocal lst, temp
            if not node.left and not node.right:
                if sum == total:
                    temp.append(node.val)
                    lst.append(temp.copy())
                    temp.pop()
                return
            temp.append(node.val)
            if node.left:
                dfs(node.left, total + node.left.val)
            if node.right:
                dfs(node.right, total + node.right.val)
            temp.pop()

        dfs(root, root.val)
        return lst
