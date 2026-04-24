// Last updated: 4/24/2026, 10:22:33 PM
1class Solution {
2    public int compareVersion(String version1, String version2) {
3
4        List<String> v1 = new ArrayList<>(Arrays.asList(version1.split("\\.")));
5        List<String> v2 = new ArrayList<>(Arrays.asList(version2.split("\\.")));
6        int n1 = v1.size(), n2 = v2.size();
7        if (n1 < n2) {
8            for (int i = 0; i < n2 - n1; i++) {
9                v1.add("0");
10            }
11        } else if (n1 > n2) {
12            for (int i = 0; i < n1 - n2; i++) {
13                v2.add("0");
14            }
15        }
16
17        int i = 0;
18        int j = 0;
19         
20        while (i < v1.size() && j < v2.size()) {
21            if (Integer.parseInt(v1.get(i)) < Integer.parseInt(v2.get(j))) {
22                return -1;
23            } else if (Integer.parseInt(v1.get(i)) > Integer.parseInt(v2.get(j))) {
24                return 1;
25            }
26            i++;
27            j++;
28        }
29        return 0;
30    }
31}