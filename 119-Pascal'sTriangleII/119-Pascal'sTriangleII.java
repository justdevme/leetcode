// Last updated: 6/13/2026, 7:15:31 PM
1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<Integer> row = new ArrayList<>();
4        
5        // Luôn khởi tạo phần tử đầu tiên là 1 (Dòng 0)
6        row.add(1);
7        
8        // Chạy vòng lặp để xây dựng từ dòng 1 đến rowIndex
9        for (int i = 1; i <= rowIndex; i++) {
10            
11            // Bước 1: Thêm số 1 vào cuối dòng để mở rộng kích thước dòng mới
12            row.add(1);
13            
14            // Bước 2: Cập nhật các phần tử ở giữa từ phải qua trái
15            // Ta chạy từ vị trí (kế cuối) về vị trí số 1
16            for (int j = i - 1; j > 0; j--) {
17                int newValue = row.get(j) + row.get(j - 1);
18                row.set(j, newValue); // Cập nhật lại giá trị tại vị trí j
19            }
20        }
21        
22        return row;
23    }
24}