public class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> dict = new HashMap<>();
        dict.put('[', ']');
        dict.put('(', ')');
        dict.put('{', '}');
        dict.put('<', '>');
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            if (dict.containsKey(s.charAt(i))) stk.push(dict.get(s.charAt(i)));
            else {
                if (stk.isEmpty()) return false;
                else {
                    if (stk.peek() == s.charAt(i)) stk.pop();
                    else return false;
                }
            }
        }
        return stk.isEmpty();
    }
}
