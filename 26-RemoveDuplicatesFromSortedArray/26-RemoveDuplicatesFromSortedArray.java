// Last updated: 7/28/2025, 6:15:18 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        if (k == 0) return 0;
        int l = 0;
        for (int r = 0; r < k; r++) {
            if(nums[l] != nums[r]) {
                nums[l + 1] = nums[r];
                l++;
            }
        }
        return l + 1;
    }
}