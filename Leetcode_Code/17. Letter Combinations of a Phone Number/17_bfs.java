public class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();
        List<String> dict = new ArrayList<>(Arrays.asList(" ", "*", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"));
        Queue<String> Q = new LinkedList<>();
        String letter = dict.get(digits.charAt(0) - '0');
        for (int i = 0; i < letter.length(); ++i)
            Q.add("" + letter.charAt(i));
        if (digits.length() == 1) return new ArrayList<>(Q);
        for (int i = 1; i < digits.length(); ++i) {
            letter = dict.get(digits.charAt(i) - '0');
            int size = Q.size();
            for (int j = 0; j < size; ++j) {
                String head = Q.poll();
                for (int k = 0; k < letter.length(); ++k) {
                    Q.add(head + letter.charAt(k));
                }
            }
        }
        return new ArrayList<>(Q);
    }
}
