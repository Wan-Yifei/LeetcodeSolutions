class Solution:
    def nthUglyNumber(self, n):
        """
        :type n: int
        :rtype: int
        """
        arr = [1]
        i1 = i2 = i3 = 0
        while len(arr) < n:
            m1, m2, m3 = arr[i1] * 2, arr[i2] * 3, arr[i3] * 5
            m_min = min(m1, m2, m3)
            if m_min == m1:
                i1 += 1
            if m_min == m2:
                i2 += 1
            if m_min == m3:
                i3 += 1
            arr.append(m_min)
        return arr[-1]
