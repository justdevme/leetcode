// Last updated: 1/7/2026, 12:36:20 AM
class Solution {
    private static Map<Character, String> nums = new HashMap<>();
    private static List<String> res = new ArrayList<>();
    static {
        nums.put('2', "abc");
        nums.put('3', "def");
        nums.put('4', "ghi");
        nums.put('5', "jkl");
        nums.put('6', "mno");
        nums.put('7', "pqrs");
        nums.put('8', "tuv");
        nums.put('9', "wxyz");
    }

    private static void Try(List<String> result, StringBuilder combination, String digits, int index) {
        if(index == digits.length()){
            result.add(combination.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = nums.get(digit);
        for (Character i : letters.toCharArray()){
            combination.append(i);
            Try(result, combination, digits, index + 1);
            combination.deleteCharAt(combination.length() - 1); // xóa kí tự cuối cùng để thêm kí tự khác
        }

    }
    public List<String> letterCombinations(String digits) {
        res.clear();
        if(digits.equals("")) return res;
        else{
           Try(res, new StringBuilder(), digits, 0);
           return res; 
        }
        
    }
}