# Last updated: 1/7/2026, 12:36:17 AM
class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        #Valid Row
        for i in range (9):
            s = set()
            for j in range (9):
                item = board[i][j]
                if item in s:
                    return False
                elif item != '.':
                    s.add(item)
        #valid cols
        for j in range (9):
            s = set()
            for i in range (9):
                item = board[i][j]
                if item in s:
                    return False
                elif item != '.':
                    s.add(item)
        #valid box 
        starts = [(0,0), (0, 3), (0, 6),
                  (3, 0), (3, 3), (3, 6),
                  (6, 0), (6, 3), (6, 6) ]
        for i, j in starts:
            s = set()
            for k in range (i, i+3):
                for k1 in range (j, j+3):
                    item = board[k][k1]
                    if item in s:
                        return False
                    elif item != '.':
                        s.add(item)
        return True