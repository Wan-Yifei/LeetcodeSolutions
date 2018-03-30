class Solution:
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        hm = set()
        result = set()
        for i in range(len(nums)):
            if nums[i] not in hm:
                hm.add(nums[i])
            else:
                result.add(nums[i])
        return list(result)
