public class Solution {
    public static String longestPalindrome(String s) {
        int sz = s.length();
        if (sz < 2) return s;
        int start = 0, maxlen = 1;
        boolean[][] dp = new boolean[sz][sz];
        for (int i = 0; i < sz; ++i) dp[i][i] = true;
        for (int i = 0; i < sz - 1; ++i) dp[i][i + 1] = true;
        for (int i = 1; i < sz; ++i) {
            for (int j = 0; j < sz - i; ++j) {
                boolean test1 = s.charAt(i + j) == s.charAt(j);
                boolean test2 = dp[i + j - 1][j + 1];
                dp[i + j][j] = test1 && test2;
                if (test1 && test2 && i + 1 > maxlen) {
                    maxlen = i + 1;
                    start = j;
                }
            }
        }
        return s.substring(start, start + maxlen);
    }
}
