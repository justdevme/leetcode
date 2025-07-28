# Last updated: 7/28/2025, 6:15:17 PM
class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        i1 = 0
        for i in range(len(nums)):
            if nums[i] != val:
                nums[i1] = nums[i]
                i1 += 1
        return i1
        
        