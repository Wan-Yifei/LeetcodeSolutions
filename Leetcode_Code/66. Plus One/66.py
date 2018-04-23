class Solution:
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        lst = []
        jinwei = 0
        fst = 1
        for i in range(len(digits) - 1, -1, -1):
            if fst != 1:
                if digits[i] + jinwei == 10:
                    lst.append(0)
                    jinwei = 1
                else:
                    lst.append(digits[i] + jinwei)
                    jinwei = 0
            else:
                fst = 0
                if digits[i] == 9:
                    lst.append(0)
                    jinwei = 1
                else:
                    lst.append(digits[i] + 1)
        if jinwei == 1:
            lst.append(1)
        lst.reverse()
        return lst
