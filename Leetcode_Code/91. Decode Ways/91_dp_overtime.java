public class Solution {
    public int numDecodings(String s) {
        if (s.length() == 0)
            return s.length();
        numDecodings_dp(s);
        return result;
    }

    private void numDecodings_dp(String s) {
        if (s.length() == 0)
            result++;
        if (s.length() >= 1 && isLetter(s.substring(0, 1)))
            numDecodings_dp(s.substring(1, s.length()));
        if (s.length() >= 2 && isLetter(s.substring(0, 2)))
            numDecodings_dp(s.substring(2, s.length()));
    }

    private boolean isLetter(String s) {
        if (s.length() == 1)
            return s.charAt(0) > '0';
        else if (s.charAt(0) != '0' && (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0') <= 26)
            return true;
        return false;
    }

    private int result = 0;
}
