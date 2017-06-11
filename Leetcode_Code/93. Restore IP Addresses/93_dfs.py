class Solution(object):
    def __init__(self):
        self.result = []
        self.l = []

    def restoreIpAddresses(self, s):
        """
        :type s: str
        :rtype: List[str]
        """
        if len(s) >= 4:
            self.restoreIpAddresses_dfs(s, 0, 0)
        return self.result

    def restoreIpAddresses_dfs(self, s, start, num):
        if start >= len(s) and len(self.l) == 4:
            sb = ""
            for i in range(len(self.l)):
                sb += str(self.l[i])
                if i < len(self.l) - 1:
                    sb += '.'
            self.result.append(sb)
            return
        if 4 - num > len(s) - start or (4 - num) * 3 < len(s) - start:
            return
        for i in range(1, 4):
            if start <= len(s) - i:
                temp = int(s[start:start + i])
                if i == 1:
                    testNum = 0
                else:
                    testNum = 10 ** (i - 1)
                if testNum <= temp < 256:
                    self.l.append(temp)
                    self.restoreIpAddresses_dfs(s, start + i, num + 1)
                    self.l.pop()
