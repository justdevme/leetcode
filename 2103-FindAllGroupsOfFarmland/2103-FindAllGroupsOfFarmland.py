# Last updated: 7/28/2025, 6:14:15 PM
from collections import deque
class Solution:
    def findFarmland(self, land: List[List[int]]) -> List[List[int]]:
        q = deque([])
        visited = set()
        res = []

        for row in range(len(land)):
            for col in range(len(land[0])):
                if land[row][col] == 1 and (row, col) not in visited:
                    q.append((row, col))
                    farm = []
                    while len(q) != 0:
                        r, c = q.popleft()
                        visited.add((r, c))
                        farm.append((r, c))

                        if 0 <= r+1 < len(land) and 0 <= c < len(land[0]) and land[r+1][c] == 1 and (r+1,c) not in visited:
                            q.append((r+1,c))
                            visited.add((r+1,c))
                        if 0 <= r-1 < len(land) and 0 <= c < len(land[0]) and land[r-1][c] == 1 and (r-1,c) not in visited:
                            q.append((r-1,c))
                            visited.add((r-1,c))
                        if 0 <= r < len(land) and 0 <= c+1 < len(land[0]) and land[r][c+1] == 1 and (r,c+1) not in visited:
                            q.append((r,c+1))
                            visited.add((r,c+1))
                        if 0 <= r < len(land) and 0 <= c-1 < len(land[0]) and land[r][c-1] == 1 and (r,c-1) not in visited:
                            q.append((r,c-1))
                            visited.add((r,c-1))
                    if len(farm) == 1:
                        res.append([farm[0][0], farm[0][1], farm[0][0], farm[0][1]])
                    else:
                        res.append([farm[0][0], farm[0][1], farm[len(farm)-1][0], farm[len(farm)-1][1]])
        return res
        # farm[-1][0], farm[-1][1] = len(farm) -1
        

