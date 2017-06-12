public class Solution {
    public String reverseWords(String s) {
        if (s.length() == 0 || s == null)
            return "";
        int idx = 0;
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; --i) {
            char c = s.charAt(i);
            if (c != ' ') {
                result.insert(idx, c);
            } else {
                result.append(' ');
                idx = s.length() - i;
            }
        }
        return String.valueOf(result);
    }
}
