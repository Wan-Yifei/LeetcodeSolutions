class Solution:
    def fractionAddition(self, expression):
        """
        :type expression: str
        :rtype: str
        """

        # define GCD and LCM
        def gcd(x1, x2):
            if x2 is 0:
                return x1
            return gcd(x2, x1 % x2)

        def lcm(x1, x2):
            return x1 * x2 / gcd(x1, x2)

        # translate string
        expression += '#'
        sign = 1
        path = list()
        a = 0
        b = 1
        ab = True
        s = 0
        for i in range(len(expression)):
            c = expression[i]
            if c is ' ':
                i += 1
                continue
            if c in ['-', '+', '/', '#']:
                if ab:
                    a = sign * s
                else:
                    b = s
                if c != '/' and i is not 0:
                    path.append([a, b])
                if c is '-':
                    sign = -1
                    ab = True
                elif c is '+':
                    sign = 1
                    ab = True
                elif c is '/':
                    ab = not ab
                s = 0

            elif '9' >= c >= '0':
                s = 10 * s + int(c)

        def sum_fraction(num1, num2):
            gcd_num = lcm(int(num1[1]), int(num2[1]))
            m1 = gcd_num / num1[1]
            m2 = gcd_num / num2[1]
            sum_m = num1[0] * m1 + num2[0] * m2
            return [sum_m, gcd_num]

        previous = path[0]
        i = 1
        while i < len(path):
            if int(previous[0]) is 0:
                previous = path[i]
            else:
                previous = sum_fraction(previous, path[i])
            i += 1
        gcd_result = gcd(int(previous[0]), int(previous[1]))
        return str(int(previous[0] / gcd_result)) + '/' + str(int(previous[1] / gcd_result))
