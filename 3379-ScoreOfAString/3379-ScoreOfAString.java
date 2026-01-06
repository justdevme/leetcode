// Last updated: 1/7/2026, 12:35:42 AM
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