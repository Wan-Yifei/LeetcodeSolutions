class Solution(object):
    def __init__(self):
        self.result = []

    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        if n is not 0:
            self.generateParenthesis_dfs(n, "", 0, 0)
        return self.result

    def generateParenthesis_dfs(self, n, now, left, right):
        if left is n and right is n:
            self.result.append(now)
            return
        if left < n:
            self.generateParenthesis_dfs(n, now + "(", left + 1, right)
        if right < left:
            self.generateParenthesis_dfs(n, now + ")", left, right + 1)
