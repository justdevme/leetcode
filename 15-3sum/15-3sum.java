// Last updated: 7/28/2025, 6:15:22 PM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;
        for(int i = 0; i < length; i++) {
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i + 1;
            int k = length - 1;
            while (j < k){
                int total = nums[i] + nums[j] + nums[k];
                if (total > 0){
                    k--;
                }
                else if(total < 0){
                    j++;
                }
                else{
                    List<Integer> sublist = Arrays.asList(nums[i], nums[j], nums[k]);

       
                    res.add(sublist);
                    
                    j++;
                    while(nums[j] == nums[j-1] && j < k){
                        j++;
                    }
                }
            }
        }
        return res;
    }
}