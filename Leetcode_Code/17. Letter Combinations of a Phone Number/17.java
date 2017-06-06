public class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return result;
        List<String> dict = new ArrayList<>(Arrays.asList(" ", "*", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"));
        letterCombinations_dfs(digits, "", 0, dict);
        return result;
    }

    private List<String> result = new ArrayList<>();

    private void letterCombinations_dfs(String digits, String now, int index, List<String> dict) {
        if (index == digits.length()) {
            result.add(now);
            return;
        }
        String letter = dict.get(digits.charAt(index) - '0');
        for (int i = 0; i < letter.length(); ++i) {
            letterCombinations_dfs(digits, now + letter.charAt(i), index + 1, dict);
        }
    }
}
