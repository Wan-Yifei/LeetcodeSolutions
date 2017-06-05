public class Solution {
    public int myAtoi(String str) {
        if (str.length() == 0) return 0;
        int startindex = 0, sign = 1;
        long sum = 0;
        while (str.charAt(startindex) == ' ') startindex++;
        if (str.charAt(startindex) == '-' || str.charAt(startindex) == '+') {
            sign = str.charAt(startindex) == '-' ? -1 : 1;
            if (str.length() < 2 || str.charAt(startindex + 1) > '9' || str.charAt(startindex + 1) < '0')
                return 0;
            startindex++;
        }
        for (int i = startindex; i < str.length(); ++i) {
            if (str.charAt(i) <= '9' && str.charAt(i) >= '0') {
                sum = 10 * sum + (str.charAt(i) - '0');
                if (sum > Integer.MAX_VALUE) break;
            } else break;
        }
        sum *= sign;
        if (sum < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (sum > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int) sum;
    }
}
