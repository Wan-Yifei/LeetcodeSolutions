# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        if root is None:
            return None
        mx = max(p.val, q.val)
        mn = min(p.val, q.val)
        while True:
            value = root.val
            if value <= mx and value >= mn:
                return root
            if value < mn:
                root = root.right
            if value > mx:
                root = root.left
