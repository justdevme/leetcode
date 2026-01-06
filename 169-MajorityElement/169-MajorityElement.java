// Last updated: 1/7/2026, 12:35:53 AM
class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashmap.containsKey(nums[i])) {
                hashmap.replace (nums[i], hashmap.get(nums[i]), hashmap.get(nums[i]) + 1);
            } else {
                hashmap.put(nums[i], 1);
            }
        }
        int maxKey = 0;
        int maxValue = 0;

        for(Map.Entry <Integer, Integer> entry : hashmap.entrySet()) {
            if(entry.getValue() > maxValue) {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        return maxKey;

    }
}