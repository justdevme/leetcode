// Last updated: 9/30/2025, 2:12:46 PM
class Solution {
    public int scoreOfString(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            sum += Math.abs(chars[i] - chars[i + 1]);
        }
        return sum;
    }
}