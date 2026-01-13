// Last updated: 1/13/2026, 4:12:10 PM
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        if (magazine.length() < ransomNote.length()) return false;
4        else {
5            Map <Character, Integer> s1 = new HashMap<>();
6            Map <Character, Integer> s2 = new HashMap<>();
7            for (char x : ransomNote.toCharArray()) {
8                s1.put (x, s1.getOrDefault(x, 0) + 1);
9            }
10             for (char x : magazine.toCharArray()) {
11                s2.put (x, s2.getOrDefault(x, 0) + 1);
12            }
13            for (char x : s1.keySet()) {
14                if(s1.get(x) > s2.getOrDefault(x, 0)) return false;
15            }
16            return true;
17        }
18    }
19}