// Last updated: 4/2/2026, 10:14:51 PM
1class Solution {
2    public boolean exist(char[][] board, String word) { 
3        int m = board.length; 
4        int n = board[0].length; 
5        for (int i = 0; i < m; i++) { 
6            for (int j = 0; j < n; j++) { 
7                if (dfs(board, word, i, j, 0)) { 
8                    return true; 
9                } 
10            } 
11        } 
12        return false; 
13    }
14
15    private boolean dfs(char[][] board, String word, int i, int j, int index) {
16        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
17            return false;
18        }
19
20        if (board[i][j] != word.charAt(index)) {
21            return false;
22        }
23
24        if (index == word.length() - 1) {
25            return true;
26        }
27
28        char temp = board[i][j];
29        board[i][j] = '#'; // đánh dấu visited
30
31        boolean found =
32                dfs(board, word, i + 1, j, index + 1) ||
33                dfs(board, word, i - 1, j, index + 1) ||
34                dfs(board, word, i, j + 1, index + 1) ||
35                dfs(board, word, i, j - 1, index + 1);
36
37        board[i][j] = temp;
38
39        return found;
40    }
41
42}