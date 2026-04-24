// Last updated: 4/24/2026, 10:27:24 PM
1class Solution {
2    public int compareVersion(String version1, String version2) {
3
4        List<String> v1 = new ArrayList<>(Arrays.asList(version1.split("\\.")));
5        List<String> v2 = new ArrayList<>(Arrays.asList(version2.split("\\.")));
6        int n1 = v1.size(), n2 = v2.size();
7
8        int i = 0;
9        int j = 0;
10         
11        while (i < v1.size() || j < v2.size()) {
12            int num1 = i < n1 ? Integer.parseInt(v1.get(i)) : 0;
13            int num2 = j < n2 ? Integer.parseInt(v2.get(j)) : 0;
14            if (num1 < num2) {
15                return -1;
16            } else if (num1 > num2) {
17                return 1;
18            }
19            i++;
20            j++;
21        }
22        return 0;
23    }
24}