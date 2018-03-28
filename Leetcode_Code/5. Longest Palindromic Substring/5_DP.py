class Solution:
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        if len(s) < 2:
            return s
        # initialize array for DP
        L = [True for i in range(len(s))]
        R = [True for i in range(len(s))]

        substr = s[0]
        # start DP
        for d in range(1, len(s)):
            for i in range(len(s) - d):
                if d % 2 == 0:
                    test = L[i + 1] and s[i] == s[i + d]
                    L[i] = test
                else:
                    test = R[i + 1] and s[i] == s[i + d]
                    R[i] = test
                if test:
                    substr = s[i:i + d + 1]
        return substr
