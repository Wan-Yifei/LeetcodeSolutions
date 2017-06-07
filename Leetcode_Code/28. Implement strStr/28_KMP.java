public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (needle.length() == 1) {
            if (haystack.length() == 0) return -1;
            int i = 0;
            while (i < haystack.length() && haystack.charAt(i) != needle.charAt(0)) i++;
            return i >= haystack.length() ? -1 : i;
        }
        int[] pi = new int[needle.length()];
        KMP_arr(needle, pi);
        int start = 0, j;
        if (haystack.length() >= needle.length())
            while (start < haystack.length() - needle.length() + 1) {
                for (j = 0; j < needle.length(); ) {
                    if (haystack.charAt(j + start) == needle.charAt(j)) {
                        if (j == needle.length() - 1) return start;
                        j++;
                    } else {
                        System.out.println(start);
                        if (j == 0) start++;
                        else start += (j - pi[j - 1]);
                        break;
                    }
                }
            }
        return -1;
    }

    private void KMP_arr(String needle, int[] pi) {
        int i = 1, j = 0;
        while (i < needle.length()) {

            while (needle.charAt(i) != needle.charAt(j) && j > 0) {
                j = pi[j - 1];
            }
            if (needle.charAt(i) == needle.charAt(j)) {
                pi[i] = j + 1;
                i++;
                j++;
            } else {
                pi[i] = j;
                i++;
            }
        }
    }
}
