# Last updated: 7/28/2025, 6:14:28 PM
class Solution:
    def mincostToHireWorkers(self, quality: List[int], wage: List[int], k: int) -> float:
        res = float("inf")
        pairs = []
        total_sum = 0
        for i in range (len(quality)):
            pairs.append((wage[i] / quality[i], quality[i]))
        pairs.sort(key = lambda q1:q1[0])
        maxHeap = []

        for rate, q in pairs:
            heapq.heappush(maxHeap, -q)
            total_sum += q
            if len(maxHeap) > k:
                total_sum += heapq.heappop(maxHeap)
            if len(maxHeap) == k:
                res = min(res, total_sum * rate)
        return res


