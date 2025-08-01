// Last updated: 7/28/2025, 6:14:33 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }

        int longest = 0;
        for(int num : nums){
            if(!numSet.contains(num - 1)){
                int length = 1;

                while(numSet.contains(num + length)){
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}