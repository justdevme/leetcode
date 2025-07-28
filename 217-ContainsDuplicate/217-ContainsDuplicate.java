// Last updated: 7/28/2025, 6:14:32 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> hashset = new HashSet <Integer>();
        for(Integer n : nums) {
            if (hashset.contains(n)) {
                return true;
            } 
            hashset.add(n);
        }
        return false;
    }
}