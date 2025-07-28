# Last updated: 7/28/2025, 6:15:15 PM
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        i = len(nums) - 2
        k1 = 1
        while i >= 0 and nums[i] >= nums[i + 1]:
            k1 = 0
            i -= 1
        if i < 0:
            nums.reverse()
        else:
            tmp = float('inf')
            k = 0
            for j in range(len(nums) - 1, i, -1):
                if nums[j] > nums[i] and nums[j] < tmp:
                    tmp = nums[j]
                    k = j
            nums[i], nums[k] = nums[k], nums[i]
            nums[i + 1:] = reversed(nums[i + 1:])
        return nums
