public class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int j = 1; j < n + 1; ++j) {
            int sum = 0;
            for (int i = 0; i < j; ++i) {
                sum += dp[i] * dp[j - i - 1];
            }
            dp[j] = sum;
        }
        return dp[n];
    }
}
