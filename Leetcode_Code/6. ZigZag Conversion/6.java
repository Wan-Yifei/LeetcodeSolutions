public class Solution {
    // (2 * n - 2) * m + 0; i = 0
    // (2 * n - 2) * m + 1, (2 * n - 2) * (m + 1) - 1
    // (2 * n - 2) * m + 2, (2 * n - 2) * (m + 1) - 2
    // (2 * n - 2) * m + i, (2 * n - 2) * (m + 1) - i
    // ...i = 2
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder result = new StringBuilder();
        int sz = s.length();
        for (int i = 0; i < numRows; ++i) {
            int j = 0;
            while ((2 * numRows - 2) * j + i < sz) {
                result.append(s.charAt((2 * numRows - 2) * j + i));
                if ((2 * numRows - 2) * (j + 1) - i < sz
                        && i != 0 && i != numRows - 1)
                    result.append(s.charAt((2 * numRows - 2) * (j + 1) - i));
                j++;
            }
        }
        return result.toString();
    }
}
