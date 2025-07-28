# Last updated: 7/28/2025, 6:14:51 PM
class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        a = [1] * m 
        for i in range (m):
            a[i] = [1] * n
        for i in range(m):
            for j in range (n):
                if i != 0 and j != 0:
                    a[i][j] = a[i-1][j] + a[i][j-1]
        return a[m-1][n-1]