class Solution:
    def triangleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) < 3:
            return 0
        nums = sorted(nums)
        count = 0
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                max_long = nums[i] + nums[j]
                start = j + 1
                end = len(nums) - 1
                while start < end:
                    mid = (start + end) // 2
                    if nums[mid] < max_long:
                        start = mid
                    else:
                        end = mid
                count += (end - j)
        return count
