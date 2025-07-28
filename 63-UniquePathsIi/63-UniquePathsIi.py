# Last updated: 7/28/2025, 6:14:49 PM
class Solution:
    def uniquePathsWithObstacles(self, obstacleGrid: List[List[int]]) -> int:
        if obstacleGrid[0][0] == 1:
            return 0
        else:
            m = len(obstacleGrid)
            n = len(obstacleGrid[0])

            a = [1] * m 
            for i in range (m):
                a[i] = [1] * n
            for i in range (m):
                for j in range (n):
                    if i == 0 or j == 0 :
                        if obstacleGrid[i][j] == 1 or a[i-1][j] == 0 or a[i][j-1] == 0:
                            a[i][j] = 0
                        else:
                            a[i][j] = 1
                    if i != 0 and j != 0 and obstacleGrid[i][j]== 0:
                        a[i][j] = a[i-1][j] + a[i][j-1]
                    elif obstacleGrid[i][j] == 1:
                       a[i][j] = 0
            return a[m-1][n-1]