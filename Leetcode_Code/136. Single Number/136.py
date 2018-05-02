class Solution:
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) < 1:
            return None
        if len(nums) == 1:
            return nums[0]
        nums.sort()
        nums = [nums[0] - 1] + nums + [nums[-1] + 1]
        print(nums)
        for i in range(len(nums) - 1):
            if nums[i] != nums[i + 1] and nums[i + 1] != nums[i + 2]:
                return nums[i + 1]
        return None
