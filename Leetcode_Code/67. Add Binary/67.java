public class Solution {
    public String addBinary(String a, String b) {
        a = String.valueOf((new StringBuilder(a)).reverse());
        b = String.valueOf((new StringBuilder(b)).reverse());
        int len1 = a.length(), len2 = b.length(), maxl = Math.max(len1, len2), minl = Math.min(len1, len2);
        char[] A, B;
        if (len1 > len2) {
            A = a.toCharArray();
            B = b.toCharArray();
        } else {
            A = b.toCharArray();
            B = a.toCharArray();
        }
        int[] result = new int[maxl + 1];
        for (int i = 0; i < maxl; ++i) {
            int sum = (A[i] - '0') + (i < minl ? (B[i] - '0') : 0) + result[i];
            int ones = sum % 2, twos = sum / 2;
            result[i] = ones;
            result[i + 1] += twos;
        }
        while (maxl > 0 && result[maxl] == 0)
            maxl--;
        StringBuilder resultString = new StringBuilder();
        for (int i = maxl; i >= 0; --i) {
            resultString.append(result[i]);
        }
        return String.valueOf(resultString);
    }
}
