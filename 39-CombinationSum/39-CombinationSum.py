# Last updated: 7/28/2025, 6:15:10 PM
class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        def solve (i,sum,cur):
            
            if i >= len(candidates) or sum > target:
                return
            if sum == target:
                res.append(cur.copy())
                return
            cur.append(candidates[i])
            solve(i, sum + candidates[i], cur)
            cur.pop()
            solve(i+1, sum , cur)
        solve(0, 0, [])
        return res
            

