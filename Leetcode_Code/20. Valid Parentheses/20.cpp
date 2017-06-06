class Solution {
public:
    bool isValid(string s) {
        map<char, char> dict = {{'[', ']'},
                                {'(', ')'},
                                {'{', '}'},
                                {'<', '>'}};
        stack<char> stk;
        for (int i = 0; i < s.length(); ++i) {
            if (dict.find(s[i]) != dict.end()) stk.push(dict[s[i]]);
            else {
                if (stk.size() == 0) return false;
                else {
                    if (stk.top() == s[i]) stk.pop();
                    else return false;
                }
            }
        }
        return stk.size() == 0;
    }
};
