public class Solution {
    public static String longestPalindrome(String s) {
        String result = "";
        if (s == null) return result;
        if (s.length() == 1) return s;
        int Size = s.length(), maxl = 0;
        for (int i = 0; i < Size - 1; ++i) {
            int j = 0;
            while (i - j >= 0 && i + j <= Size - 1 && s.charAt(i - j) == s.charAt(i + j)) j++;
            j--;
            if (maxl < 1 + 2 * j) {
                result = s.substring(i - j, i + j + 1);
                maxl = 1 + 2 * j;
            }
            if (s.charAt(i) == s.charAt(i + 1)) {
                while (i - j >= 0 && i + j + 1 <= Size - 1 && s.charAt(i - j) == s.charAt(i + 1 + j)) j++;
                j--;
                if (maxl < 2 + 2 * j) {
                    result = s.substring(i - j, i + j + 2);
                    maxl = 2 + 2 * j;
                }
            }
        }
        return result;
    }
}
