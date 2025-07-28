# Last updated: 7/28/2025, 6:15:20 PM
class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        
        stack = []
        res = []
        def backtracking (opened, closed):
            if opened == n and closed == n:
                res.append("".join(stack))
                return
            if opened < n :
                stack.append('(')
                backtracking(opened + 1, closed)
                stack.pop()
            if closed < opened :
                stack.append(')')
                backtracking(opened, closed + 1)
                stack.pop()
        backtracking(0, 0)
        return res