class Solution {
public:
    vector<string> letterCombinations(string digits) {
        queue<string> Q = letterCombinations_bfs(digits);
        vector<string> result;
        while (!Q.empty()) {
            result.push_back((string) Q.front());
            Q.pop();
        }
        return result;
    }

private:
    queue<string> letterCombinations_bfs(string digits) {
        queue<string> Q;
        if (digits.length() == 0) return Q;
        vector<string> dict = {" ", "*", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        string letter = dict[digits[0] - '0'];
        for (int i = 0; i < letter.length(); ++i) {
            string s;
            s.push_back(letter[i]);
            Q.push(s);
        }
        if (digits.length() == 1) return Q;
        for (int i = 1; i < digits.length(); ++i) {
            letter = dict[digits[i] - '0'];
            int size = (int) Q.size();
            for (int j = 0; j < size; ++j) {
                string head = (string) Q.front();
                Q.pop();
                for (int k = 0; k < letter.length(); ++k) {
                    Q.push(head + letter[k]);
                }
            }

        }
        return Q;
    }
};
