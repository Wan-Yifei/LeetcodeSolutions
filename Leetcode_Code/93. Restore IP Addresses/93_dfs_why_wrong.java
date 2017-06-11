public class Solution {
    public static List<String> restoreIpAddresses(String s) {
        if (s.length() < 4)
            return result;
        restoreIpAddresses_dfs(s, 0, 0);
        return result;
    }

    private static List<String> result = new ArrayList<>();
    private static Stack<Integer> l = new Stack<>();

    private static void restoreIpAddresses_dfs(String s, int start, int num) {
        if (start >= s.length() && l.size() == 4) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < l.size(); ++i) {
                sb.append(String.valueOf(l.get(i)));
                if (i < l.size() - 1)
                    sb.append('.');
            }
            result.add(String.valueOf(sb));
            return;
        }
        if (4 - num > s.length() - start || (4 - num) * 3 < s.length() - start)
            return;
        int temp;
        for (int i = 1; i <= 3; ++i) {
            if (start <= s.length() - i) {
                temp = Integer.parseInt(s.substring(start, start + i));
                int testNum = (i == 1 ? 0 : (int) Math.pow(10, i - 1));
                if (temp >= testNum && temp < 256) {
                    l.add(temp);
                    restoreIpAddresses_dfs(s, start + i, num + 1);
                    l.pop();
                }
            }
        }
    }
}
