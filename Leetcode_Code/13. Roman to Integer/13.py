class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        dicto = ['I', 'V', 'X', 'L', 'C', 'D', 'M', 'v', 'x', 'l', 'c', 'd', 'm']
        dict = {'I': 1}
        sum = 1
        for i in range(1, len(dicto)):
            if i % 2 == 1:
                sum *= 5
            else:
                sum *= 2
            dict[dicto[i]] = sum
        sum = 0
        sum += dict[s[0]]
        for i in range(1, len(s)):
            pre = dict[s[i - 1]]
            now = dict[s[i]]
            if pre < now:
                sum = sum + now - 2 * pre
            else:
                sum += now
        return sum
