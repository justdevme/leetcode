# Last updated: 7/28/2025, 6:14:27 PM
class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort()
        l, r = 0, len(people) - 1
        count = 0
        while l <= r:
            remain = limit - people[r]
            count += 1
            r -= 1
            if l <= r and remain >= people[l]:
                
                l += 1
            
        return count