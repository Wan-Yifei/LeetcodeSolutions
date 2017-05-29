# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def __init__(self):
        self.result = None
        self.terminate = False

    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        if root is None:
            return None
        self.lowestCommonAncestor_dfs(root, p, q)
        return self.result

    def lowestCommonAncestor_dfs(self, root, p, q):
        if self.terminate == False:
            if root is None:
                return False
            bl = self.lowestCommonAncestor_dfs(root.left, p, q)
            br = self.lowestCommonAncestor_dfs(root.right, p, q)
            now = root == p or root == q
            if (bl and br) or (bl and now) or (br and now):
                self.result = root
                self.terminate = True
            return now or bl or br
