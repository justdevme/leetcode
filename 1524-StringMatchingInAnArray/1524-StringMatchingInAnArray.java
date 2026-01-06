// Last updated: 1/7/2026, 12:35:46 AM
class Solution {
    public List<String> stringMatching(String[] words) {
        
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break; // không cần check thêm, chỉ cần tìm thấy 1 là đủ
                }
            }
        }
        return result;
    }
    
}