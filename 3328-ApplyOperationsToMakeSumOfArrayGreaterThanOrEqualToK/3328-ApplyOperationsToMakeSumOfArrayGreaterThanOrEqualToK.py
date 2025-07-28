# Last updated: 7/28/2025, 6:14:19 PM
class Solution:
    def minOperations(self, k: int) -> int:
        base_value = 1
        increase_operations = 0
        dup_operations = 0

        target = int(k ** 0.5)
        increase_operations = target - base_value
        base_value = target

        currentsum = base_value
        while currentsum < k:
            currentsum += target
            dup_operations += 1
        total = increase_operations + dup_operations
        return total
