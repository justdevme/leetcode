# Last updated: 7/28/2025, 6:14:17 PM
class Solution:
    def largestLocal(self, grid: List[List[int]]) -> List[List[int]]:
        n, res = len(grid), []

        for i in range(1, n - 1):
            temp_row = []
            for j in range(1, n - 1):
                temp = 0

                for k in range(i - 1, i + 2):
                    for l in range(j - 1, j + 2):
                        temp = max(temp, grid[k][l])

                temp_row.append(temp)
            res.append(temp_row)

        return res