# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def kthSmallest(self, root, k):
        """
        :type root: TreeNode
        :type k: int
        :rtype: int
        """
        n = 0
        result = 0
        test = True

        def dfs(node):
            nonlocal n, result, test
            if test:
                if not node:
                    return
                dfs(node.left)
                # in order
                n += 1
                if n is k:
                    result = node.val
                    test = False
                    return
                dfs(node.right)

        dfs(root)
        return result
