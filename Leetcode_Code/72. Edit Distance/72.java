public class Solution {
    public int minDistance(String word1, String word2) {
        int maxl = Math.max(word1.length(), word2.length()), minl = Math.min(word1.length(), word2.length());
        if (minl == 0)
            return maxl;
        char[] arrL, arrS;
        if (word1.length() > word2.length()) {
            arrL = word1.toCharArray();
            arrS = word2.toCharArray();
        } else {
            arrL = word2.toCharArray();
            arrS = word1.toCharArray();
        }
        int[][] dp = new int[2][maxl + 1];
        for (int i = 0; i < maxl + 1; ++i) {
            dp[0][i] = i;
        }
        for (int i = 0; i < arrS.length; ++i) {
            dp[(i + 1) % 2][0] = i + 1;
            for (int j = 0; j < arrL.length; ++j) {
                if (arrL[j] != arrS[i])
                    dp[(i + 1) % 2][j + 1] = min3(dp[(i + 1) % 2][j], dp[i % 2][j], dp[i % 2][j + 1]) + 1;
                else
                    dp[(i + 1) % 2][j + 1] = dp[i % 2][j];
            }
        }
        return dp[arrS.length % 2][arrL.length];
    }

    private int min3(int a, int b, int c) {
        return Math.min(a, Math.min(c, b));
    }
}
