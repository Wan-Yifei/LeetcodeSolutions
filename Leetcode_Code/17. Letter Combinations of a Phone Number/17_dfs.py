class Solution(object):
    def __init__(self):
        self.result = []
        self.dict = [" ", "*", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"]

    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        if len(digits) == 0:
            return self.result
        self.letterCombinations_dfs(digits, "", 0)
        return self.result

    def letterCombinations_dfs(self, digits, now, index):
        if index == len(digits):
            self.result.append(now)
            return
        letter = self.dict[int(digits[index])]
        for i in range(len(letter)):
            self.letterCombinations_dfs(digits, now + letter[i], index + 1)
