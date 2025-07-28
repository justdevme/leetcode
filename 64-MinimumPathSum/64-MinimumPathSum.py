# Last updated: 7/28/2025, 6:14:48 PM
class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        m = len(grid)
        n = len(grid[0])
        sum = 0
        if m == 1 or n == 1 :
            for i in range (m):
                for j in range (n):
                    sum += grid[i][j]
            return sum
        else:
            a = [0] * m
            for i in range (m):
                a[i] = [0] * n
            a[0][0] = grid[0][0]
            for i in range (m) :
                for j in range (n):
                    
                    if i == 0 :
                        
                        a[i][j] = a[i][j-1] + grid[i][j]
                    elif j == 0:
                        a[i][j] =  a[i-1][j] + grid[i][j]
                    else:
                        a[i][j] = min(a[i-1][j] + grid[i][j], a[i][j-1] + grid[i][j])
            return a[m-1][n-1]
