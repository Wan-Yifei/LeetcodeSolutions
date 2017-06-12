public class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; --i) {
            while (i >= 0 && s.charAt(i) == ' ')
                i--;
            if (i < 0)
                break;
            result.append(' ');
            StringBuilder word = new StringBuilder();
            while (i >= 0 && s.charAt(i) != ' ') {
                word.insert(0, s.charAt(i));
                i--;
            }
            result.append(word);
        }
        if (result.length() > 1)
            result.deleteCharAt(0);
        return String.valueOf(result);
    }
}
