class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        result = ""
        if len(strs) == 0:
            return result
        test = True
        j = 0
        size0 = len(strs[0])
        while test and j < size0:
            for i in range(1, len(strs)):
                if len(strs[i]) < j + 1 or strs[i][j] != strs[i - 1][j]:
                    test = False
                    break
            if test:
                result += strs[0][j]
            j += 1
        return result
