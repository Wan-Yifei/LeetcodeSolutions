class Solution:
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        mp = {}
        l = 0
        for n in nums:
            l += 1
            if n in mp:
                mp[n] = mp[n] + 1
            else:
                mp[n] = 1
        lst = []
        for n in mp:
            if mp[n] > l / 3:
                lst.append(n)
        return lst
