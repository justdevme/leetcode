# Last updated: 1/7/2026, 12:36:06 AM
class Solution:
    def myPow(self, x: float, n: int) -> float:
        def helper (x, n):
            if n == 0 : return 1
            if x == 0 : return 0
            
            res = helper (x * x, n // 2)
            return x*res if n % 2 else res
            
        res = helper(x, abs(n))
        if n < 0 :
            return 1/res
        else:
            return res