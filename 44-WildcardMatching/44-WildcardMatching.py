# Last updated: 7/28/2025, 6:15:07 PM
class Solution:
    def isMatch(self, s: str, p: str) -> bool:
         
        matrix = [[(False) for _ in range(len(p) + 1)] for _ in range(len(s) + 1)]
        matrix[0][0] = True 
        for i in range (1, len(p) + 1):
            if p[i - 1] == '*' :
                matrix[0][i] = matrix[0][i - 1]
        
        for i in range (1,len(s)+1):
            for j in range (1,len(p)+1):
                if p[j - 1] == s[i - 1] or p[j - 1] == '?':
                    matrix[i][j] = matrix[i - 1][j - 1]
                if p[j - 1] == '*':
                    matrix[i][j] = matrix[i - 1][j] or matrix[i][j - 1] 
                        
                    
        return matrix[len(s)][len(p)]
