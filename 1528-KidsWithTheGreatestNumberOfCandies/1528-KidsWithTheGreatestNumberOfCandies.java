// Last updated: 7/28/2025, 6:14:24 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int tmp = 0;
        for(Integer can : candies) {
            if (can > tmp) {
                tmp = can;
            }
        }
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= tmp) {
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
}