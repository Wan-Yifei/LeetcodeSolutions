public class Solution {
    public String shortestPalindrome(String s) {
        if (s.length() < 2)
            return s;
        StringBuilder sb = new StringBuilder(s), rb = new StringBuilder(sb);
        rb.reverse();
        sb.append("亢");
        sb.append(rb);
        List<Integer> table = KMP_table(sb.toString());
        if (table.get(table.size() - 1) == table.size() - 1)
            return s;
        System.out.println(table);
        rb.setLength(0);
        rb.append(s.substring(table.get(table.size() - 1)));
        rb.reverse();
        rb.append(s);
        return rb.toString();
    }

    private List<Integer> KMP_table(String s) {
        char[] S = s.toCharArray();
        List<Integer> p = new ArrayList<>();
        p.add(0);
        int j = 0;
        for (int i = 1; i < S.length; i++) {
            while (j > 0 && S[j] != S[i])
                j = p.get(j - 1);
            if (S[j] == S[i])
                j++;
            p.add(j);
        }
        return p;
    }
}
