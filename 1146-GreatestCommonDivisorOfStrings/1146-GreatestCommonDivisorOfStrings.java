// Last updated: 7/28/2025, 6:14:25 PM
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1))
            return "";
        int gcd = gcd1(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }
    private int gcd1(int a, int b) {
        return b == 0 ? a : gcd1(b, a % b);
    }
}