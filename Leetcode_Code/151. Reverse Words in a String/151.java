public class Solution {
    public String reverseWords(String s) {
        if (s.length() == 0 || s == null)
            return "";
        int idx = 0, index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.charAt(i) != ' ') {
                index++;
                result.insert(idx, s.charAt(i));
            } else {
                while (i >= 0 && s.charAt(i) == ' ') {
                    i--;
                }
                if (i < 0)
                    break;
                i++;
                result.append(' ');
                idx = index + 1;
                index++;
            }
        }
        if (result.length() > 1 && result.charAt(0) == ' ')
            result.deleteCharAt(0);
        return String.valueOf(result);
    }
}
