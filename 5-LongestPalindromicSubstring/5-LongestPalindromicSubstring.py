# Last updated: 7/28/2025, 6:15:32 PM
class Solution:
    def longestPalindrome(self, s: str) -> str:
        n = len(s)
        res = ""
        ans = 0

        #odd length palindrome 
        for i in range (n):
            l, r = i, i
            while l >= 0 and r < n and s[l] == s[r]:
                if r - l + 1 > ans:
                    res = s[l:r+1]
                    ans = r - l + 1
                l -= 1
                r += 1
        
            l, r = i, i+1
            while l >= 0 and r < n and s[l] == s[r]:
                if r - l + 1 > ans:
                    res = s[l:r+1]
                    ans = r - l + 1
                l -= 1
                r += 1
        return res
