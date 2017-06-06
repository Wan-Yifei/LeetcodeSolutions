class Solution {
public:
    vector<string> letterCombinations(string digits) {
        if (digits.length() == 0) return result;
        vector<string> dict = {" ", "*", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        letterCombinations_dfs(digits, "", 0, dict);
        return result;
    }

private:
    vector<string> result;

    void letterCombinations_dfs(string &digits, string now, int index, vector<string> &dict) {
        if (index == digits.length()) {
            result.push_back(now);
            return;
        }
        string letter = dict[digits[index] - '0'];
        for (int i = 0; i < letter.length(); ++i)
            letterCombinations_dfs(digits, now + letter[i], index + 1, dict);
    }
};
