// Last updated: 4/20/2026, 11:38:33 AM
1class Solution {
2    public int hIndex(int[] citations) {
3        int l = 0, r = citations.length - 1;
4        while (l <= r) {
5            int mid = (l + r) / 2;
6            if(citations[mid] >= citations.length - mid) {
7                r = mid - 1;
8            } else {
9                l = mid + 1;
10            }
11        }
12        return citations.length - l;
13    }
14}