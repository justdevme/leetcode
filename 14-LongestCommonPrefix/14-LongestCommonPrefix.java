// Last updated: 7/28/2025, 6:15:24 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        ArrayList<String> tmp = new ArrayList<String>();
        for (String str : strs){
            tmp.add(str);
        }
        String res = "";
        int k = findMinLength(tmp);
        for (int i = 0; i < k ; i++) {
            int check = 1;
            for (int j = 1; j < tmp.size(); j++) {
                if(tmp.get(0).charAt(i) != tmp.get(j).charAt(i)){
                    check = 0;
                    break;
                }
            }
            if (check == 0) {
                break;
            } else {
                res += tmp.get(0).charAt(i);
            }
        }
        return res;
    }
    public static int findMinLength(ArrayList<String> list) {
        int minLength = Integer.MAX_VALUE;
        for (String s : list) {
            if (s.length() < minLength) {
                minLength = s.length();
            }
        }
        return minLength;
    }
}