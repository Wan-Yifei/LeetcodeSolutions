# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def __init__(self):
        self.result = []

    def pathSum(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: List[List[int]]
        """
        if root:
            self.pathSum_dfs(root, [], sum)
        return self.result

    def pathSum_dfs(self, root, stack, sum):
        if root.left is None and root.right is None:
            if sum == root.val:
                self.result.append(stack + [root.val])
            return
        sum -= root.val
        if root.left is not None:
            self.pathSum_dfs(root.left, stack + [root.val], sum)
        if root.right is not None:
            self.pathSum_dfs(root.right, stack + [root.val], sum)
