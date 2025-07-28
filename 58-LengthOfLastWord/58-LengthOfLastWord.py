# Last updated: 7/28/2025, 6:14:53 PM
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        words = s.strip().split()

        if not words:
            return 0
        return len(words[-1])
