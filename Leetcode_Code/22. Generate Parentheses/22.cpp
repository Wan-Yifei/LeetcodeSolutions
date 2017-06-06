class Solution {
public:
    vector<string> generateParenthesis(int n) {
        if (n == 0) return {};
        vector<string> result;
        generateParenthesis_dfs(n, "", 0, 0, result);
        return result;
    }

private:
    void generateParenthesis_dfs(int n, string now, int left, int right, vector<string> &result) {
        if (left == n && right == n) {
            result.push_back(now);
            return;
        }
        if (left < n)
            generateParenthesis_dfs(n, now + "(", left + 1, right, result);
        if (left > right)
            generateParenthesis_dfs(n, now + ")", left, right + 1, result);
    }
};
