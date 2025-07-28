# Last updated: 7/28/2025, 6:15:30 PM
class Solution:
    def convert(self, s: str, n: int) -> str:
        if n == 1 :
            return s
        else:
            k1 = n

            s1 =''
            for r in range (n):
                k1 = (n - 1)*2
                for i in range(r, len(s), k1):
                    s1 += s[i]
                    if r > 0 and r < n - 1 and i + k1 - 2*r < len(s):
                        s1 += s[i + k1 - 2*r]
            return s1