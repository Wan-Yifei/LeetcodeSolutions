public class Solution {
    public static int calculate(String s) {
        if (s.length() == 0)
            return 0;
        char sign = '+';
        int num = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = 10 * num + (c - '0');
            }
            if (!Character.isDigit(c) && c != ' ' || i == s.length() - 1) {
                if (sign == '-')
                    stack.push(-num);
                if (sign == '+')
                    stack.push(num);
                if (sign == '*')
                    stack.push(stack.pop() * num);
                if (sign == '/')
                    stack.push(stack.pop() / num);
                sign = c;
                num = 0;
            }
        }
        num = 0;
        while (!stack.isEmpty())
            num += stack.pop();
        return num;
    }
}
