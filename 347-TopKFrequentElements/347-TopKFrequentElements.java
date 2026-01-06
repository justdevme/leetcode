// Last updated: 1/7/2026, 12:35:51 AM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // hash table count 
        // sort -> trích ra k phần tử cuối
        HashMap <Integer, Integer> temp = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if(temp.containsKey(nums[i])){
                temp.put(nums[i], temp.get(nums[i]) + 1);
            } else {
                temp.put(nums[i], 1);
            }
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(temp.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        // Tạo mảng kết quả để lưu k phần tử đầu tiên
        int[] result = new int[k];

        // Trích xuất k phần tử có tần suất cao nhất
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        // Trả về mảng kết quả
        return result;
    }
}