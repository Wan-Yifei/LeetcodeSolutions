public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        if (strs.length == 0) return result.toString();
        boolean test = true;
        int j = 0;
        int size0 = strs[0].length();
        while (test && j < size0) {
            for (int i = 1; i < strs.length; ++i) {
                if (strs[i].length() < j + 1 || strs[i].charAt(j) != strs[i - 1].charAt(j)) {
                    test = false;
                    break;
                }
            }
            if (test) result.append(strs[0].charAt(j));
            j++;
        }
        return result.toString();
    }
}
