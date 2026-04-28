// Last updated: 4/28/2026, 3:29:08 PM
1class Solution {
2    public int findRadius(int[] houses, int[] heaters) {
3        Arrays.sort(heaters);
4
5        int answer = 0;
6
7        for(int house: houses) {
8            int idx = lowerBound(heaters, house);
9
10            int distRight = Integer.MAX_VALUE;
11            int distLeft = Integer.MAX_VALUE;
12
13            // heater bên phải
14            if (idx < heaters.length) {
15                distRight = Math.abs(heaters[idx] - house);
16            }
17            // heater bên trái
18            if (idx - 1 >= 0) {
19                distLeft = Math.abs(house - heaters[idx - 1]);
20            }
21
22            int nearestDistance = Math.min(distLeft, distRight);
23
24            answer = Math.max(answer, nearestDistance);
25        }
26        return answer;
27    }
28    private int lowerBound(int[] heaters, int target) {
29        int left = 0;
30        int right = heaters.length;
31
32        while (left < right) {
33            int mid = left + (right - left) / 2;
34
35            if (heaters[mid] >= target) {
36                right = mid;
37            } else {
38                left = mid + 1;
39            }
40        }
41
42        return left;
43    }
44}