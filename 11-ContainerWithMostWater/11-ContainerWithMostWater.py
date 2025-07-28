# Last updated: 7/28/2025, 6:15:26 PM
class Solution:
    def maxArea(self, height: List[int]) -> int:
        res = 0
        r = 0
        l = len(height) - 1
        while (r < l):
            res = max(res, min(height[r],height[l]) * (l - r))
            if height[r] > height[l] :
                l -= 1
            else:
                r += 1
        return res