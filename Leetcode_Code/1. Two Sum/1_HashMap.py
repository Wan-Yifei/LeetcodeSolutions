class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        mp = {}
        for i in range(len(nums)):
            v = nums[i]
            if target - v in mp:
                return [mp[target - v], i]
            else:
                mp[v] = i
