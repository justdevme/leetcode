# Last updated: 7/28/2025, 6:15:09 PM
class Solution:
    def trap(self, height: List[int]) -> int:
        n = len(height)
        l, r = 0, n - 1
        maxL, maxR = height[l], height[r]

        res = 0
        
        while l < r:
            if maxL < maxR :
                l += 1
                maxL = max(maxL, height[l])
                res += maxL - height[l]
            else:
                r -= 1
                maxR = max(maxR, height[r])
                res += maxR - height[r]
        return res