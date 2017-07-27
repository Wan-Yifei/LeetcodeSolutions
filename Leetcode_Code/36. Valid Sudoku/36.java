public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                Character c = board[i][j];
                if (c != '.' && map.get(c) != null && !map.get(c))
                    return false;
                map.put(c, false);
            }
            map.clear();
        }
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                Character c = board[j][i];
                if (c != '.' && map.get(c) != null && !map.get(c))
                    return false;
                map.put(c, false);
            }
            map.clear();
        }
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                for (int ii = 0; ii < 3; ++ii) {
                    for (int jj = 0; jj < 3; ++jj) {
                        Character c = board[3 * i + ii][3 * j + jj];
                        if (c != '.' && map.get(c) != null && !map.get(c))
                            return false;
                        map.put(c, false);

                    }
                }
                map.clear();
            }
        }
        return true;
    }
}
