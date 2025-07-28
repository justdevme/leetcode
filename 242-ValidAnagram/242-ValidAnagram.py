# Last updated: 7/28/2025, 6:14:37 PM
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s1 = sorted(s)
        s2 = sorted(t)
        if s1 == s2:
            return True
        else:
            return False