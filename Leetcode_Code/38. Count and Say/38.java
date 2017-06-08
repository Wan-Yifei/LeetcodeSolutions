public class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for (int j = 0; j < n - 1; ++j) {
            Character last = s.charAt(0), now;
            int count = 0;
            String sb = "";
            for (int i = 0; i < s.length(); ++i) {
                now = s.charAt(i);
                if (now == last)
                    count++;
                else {
                    sb += (String.valueOf(count) + last);
                    count = 1;
                }
                last = s.charAt(i);
            }
            sb += (String.valueOf(count) + last);
            s = sb;
        }
        return s;
    }
}
