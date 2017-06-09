public class Solution {
    public boolean isNumber(String s) {
        if (s.length() == 0)
            return false;
        String ts = trimString(s);
        int pivot = ts.indexOf('e');
        if (pivot != -1) {
            String head = ts.substring(0, pivot), tail = ts.substring(pivot + 1, ts.length());
            if (whichNumber(head) > 0 && whichNumber(tail) == 1)
                return true;
            else
                return false;
        } else
            return whichNumber(ts) > 0;
    }

    public String trimString(String s) {
        int start = 0, end = s.length() - 1;
        while (start < s.length() && s.charAt(start) == ' ')
            start++;
        while (end >= 0 && s.charAt(end) == ' ')
            end--;
        if (start > end)
            return "Hello, world!";
        return s.substring(start, end + 1);
    }

    public int whichNumber(String s) {
        /* return type: 
         * 0: not number; 
         * 1: is integer; 
         * 2: is decimal */
        if (s.length() == 0)
            return 0;
        boolean dot = false, number = false;
        int start = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+')
            start = 1;
        if (start == 1 && s.length() == 1)
            return 0;
        for (int i = start; i < s.length(); ++i) {
            if (s.charAt(i) <= '9' && s.charAt(i) >= '0') {
                number = true;
                continue;
            }
            if (s.charAt(i) == '.' && !dot)
                dot = true;
            else
                return 0;
        }
        if (dot)
            if (number)
                return 2;
            else
                return 0;
        else
            return 1;
    }
}
