class Solution(object):
    def myAtoi(self, str):
        """
        :type str: str
        :rtype: int
        """
        if len(str) == 0:
            return 0
        startindex = 0
        sign = 1
        total = 0
        sizel = len(str)
        MaxInt = (1 << 31) - 1
        while str[startindex] == ' ':
            startindex += 1
        if str[startindex] == '-' or str[startindex] == '+':
            if str[startindex] == '-':
                sign = -1
            else:
                sign = 1
            if sizel < 2 or str[startindex + 1] > '9' or str[startindex + 1] < '0':
                return 0
            startindex += 1
        for i in range(startindex, sizel):
            if str[i] > '9' or str[i] < '0':
                break
            total = 10 * total + int(str[i])
            if total > MaxInt:
                break
        total = total * sign
        if total >= MaxInt:
            return MaxInt
        if total < MaxInt * -1:
            return MaxInt * -1 - 1
        return total
