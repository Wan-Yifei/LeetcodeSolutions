class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        dict = {'[': ']', '(': ')', '{': '}', '<': '>'}
        stk = []
        for i in range(len(s)):
            if s[i] in dict:
                stk.append(dict[s[i]])
            else:
                if len(stk) == 0:
                    return False
                else:
                    if stk[len(stk) - 1] == s[i]:
                        stk.pop()
                    else:
                        return False
        return len(stk) == 0
