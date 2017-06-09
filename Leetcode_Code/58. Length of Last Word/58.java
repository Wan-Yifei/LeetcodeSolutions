public class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0)
            return 0;
        int start = s.length() - 1, len = 0;
        while (start >= 0 && s.charAt(start) == ' ')
            start--;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
            len++;
        }
        return len;
    }
}
