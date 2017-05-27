# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def __init__(self):
        self.result = []

    def rightSideView(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        self.rightSideView_dfs(root, 0)
        return self.result

    def rightSideView_dfs(self, root, layer):
        if root:
            if len(self.result) <= layer:
                self.result.append(root.val)
            self.rightSideView_dfs(root.right, layer + 1)
            self.rightSideView_dfs(root.left, layer + 1)
