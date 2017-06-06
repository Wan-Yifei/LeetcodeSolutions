public class Solution {
    public int romanToInt(String s) {
        if (s.length() == 0) return 0;
        Character[] dicto = {'I', 'V', 'X', 'L', 'C', 'D', 'M', 'v', 'x', 'l', 'c', 'd', 'm'};
        Map<Character, Integer> dict = new HashMap<>();
        int sum = 1;
        dict.put('I', 1);
        for (int i = 1; i < dicto.length; ++i) {
            if (i % 2 == 1) {
                sum *= 5;
                dict.put(dicto[i], sum);
            } else {
                sum *= 2;
                dict.put(dicto[i], sum);
            }
        }
        sum = 0;
        sum += (dict.get(s.charAt(0)));
        for (int i = 1; i < s.length(); ++i) {
            Integer pre = dict.get(s.charAt(i - 1)), now = dict.get(s.charAt(i));
            if (pre < now) sum = sum + now - 2 * pre;
            else sum += now;
        }
        return sum;
    }
}
