class Solution(object):
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        if num >= 4000000 or num < 0:
            return "error"
        dicto = ["I", "V", "X", "L", "C", "D", "M", "v", "x", "l", "c", "d", "m"]
        dict = ["I"]
        val = [1]
        sum = 1
        for i in range(1, len(dicto)):
            if i % 2 == 1:
                val.append(sum * 4)
                dict.append(dicto[i - 1] + dicto[i])
                val.append(sum * 5)
                dict.append(dicto[i])
            else:
                val.append(sum * 9)
                dict.append(dicto[i - 2] + dicto[i])
                val.append(sum * 10)
                dict.append(dicto[i])
                sum *= 10
        result = ""
        for i in range(len(dict) - 1, -1, -1):
            if num >= val[i]:
                count = num // val[i]
                num %= val[i]
                for j in range(0, count):
                    result += dict[i]
        return result
