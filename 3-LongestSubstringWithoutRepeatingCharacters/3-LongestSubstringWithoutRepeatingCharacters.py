# Last updated: 7/28/2025, 6:15:33 PM
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        res = 0
        l = 0
        charSet = set ()
        for r in range (len(s)):
            while s[r] in charSet :
                charSet.remove (s[l])
                l += 1
            charSet.add(s[r])
            res = max(res, r - l + 1)
        return res
