class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        try:
            strg = haystack.index(needle)
        except:
            return -1
        return strg
