# Last updated: 7/28/2025, 6:14:40 PM
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        table = set()
        for n in nums:
            if n in table :
                return True
            table.add(n)
        return False