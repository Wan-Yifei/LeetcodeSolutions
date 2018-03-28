class Solution:
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        # start pointer
        pool = dict()
        max_length = start = 0
        for end in range(len(s)):
            c = s[end]
            if c in pool:
                start = max(start, pool[c] + 1)
            pool[c] = end
            max_length = max(max_length, end - start + 1)
        return max_length

