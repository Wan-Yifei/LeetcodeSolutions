class Solution:
    def findLHS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        mp = {}
        for i in range(len(nums)):
            if nums[i] not in mp:
                mp[nums[i]] = 1
            else:
                mp[nums[i]] += 1
        max_count = 0
        for x in mp:
            if x + 1 in mp:
                max_count = max(max_count, mp[x] + mp[x + 1])
            else:
                continue
        return max_count
