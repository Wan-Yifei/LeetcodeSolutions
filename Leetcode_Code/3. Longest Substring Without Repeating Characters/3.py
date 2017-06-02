class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        maxl = start = 0
        dict = {}
        for i in range(len(s)):
            if dict.get(s[i]) is None or dict.get(s[i]) < start:
                maxl = max(maxl, i - start + 1)
            else:
                start = dict.get(s[i]) + 1
            dict[s[i]] = i
        return maxl
