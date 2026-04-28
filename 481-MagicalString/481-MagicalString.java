// Last updated: 4/28/2026, 3:58:41 PM
1class Solution {
2    public int magicalString(int n) {
3        if (n <= 0) return 0;
4        if (n <= 3) return 1;
5
6        int[] arr = new int[n + 2];
7
8        arr[0] = 1;
9        arr[1] = 2;
10        arr[2] = 2;
11
12        int read = 2;
13        int write = 3;
14        int num = 1;
15
16        int countOne = 1;
17
18        while (write < n) {
19            int times = arr[read];
20
21            for (int i = 0; i < times && write < n; i++) {
22                arr[write] = num;
23
24                if (num == 1) {
25                    countOne++;
26                }
27
28                write++;
29            }
30
31            num = 3 - num;
32            read++;
33        }
34
35        return countOne;
36    }
37}