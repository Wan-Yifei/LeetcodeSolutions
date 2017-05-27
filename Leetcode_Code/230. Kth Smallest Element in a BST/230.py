# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def __init__(self):
        count = None
        mini = None

    def kthSmallest(self, root, k):
        """
        :type root: TreeNode
        :type k: int
        :rtype: int
        """
        self.count = k
        self.kthSmallest_dfs(root)
        return self.mini

    def kthSmallest_dfs(self, root):
        if root is None:
            return
        if self.count > 0:
            self.kthSmallest_dfs(root.left)
        if self.count > 0:
            self.count -= 1
            self.mini = root.val
        if self.count > 0:
            self.kthSmallest_dfs(root.right)
