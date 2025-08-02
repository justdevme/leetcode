// Last updated: 8/2/2025, 4:31:18 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        ArrayList <Integer> temp = new ArrayList <>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                temp.add(nums[i]);
            }
        }
        for (int i = 0; i < temp.size() ; i++) {
            nums[i] = temp.get(i);
        }
        return temp.size();
    }
}