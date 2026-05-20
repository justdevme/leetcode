// Last updated: 5/20/2026, 10:05:59 PM
1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed, int n) {
3        for (int i = 0; i < flowerbed.length; i++) {
4            boolean empty = flowerbed[i] == 0;
5
6            boolean leftEmpty = (i == 0) || flowerbed[i - 1] == 0;
7            boolean rightEmpty = (i == flowerbed.length - 1) || flowerbed[i + 1] == 0;
8
9            if (empty && leftEmpty && rightEmpty) {
10                flowerbed[i] = 1;
11                n--;
12
13                if (n == 0) {
14                    return true;
15                }
16            }
17        }
18
19        return n <= 0;
20    }
21}