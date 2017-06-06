class Solution {
public:
    string intToRoman(int num) {
        vector<string> dict;
        vector<int> val;
        RomanNumVectors(dict, val);
        if (num >= 4000000 || num < 0) return "error";
        string result;
        for (int i = (int) (dict.size() - 1); i >= 0; --i) {
            if (num >= val[i]) {
                int count = num / val[i];
                num %= val[i];
                for (int j = 0; j < count; ++j) {
                    result.append(dict[i]);
                }
            }
        }
        return result;
    }

private:
    void RomanNumVectors(vector<string> &dict, vector<int> &val) {
        vector<string> dicto = {"I", "V", "X", "L", "C", "D", "M", "v", "x", "l", "c", "d", "m"};
        dict = {"I"};
        val = {1};
        int sum = 1;
        for (int i = 1; i < dicto.size(); ++i) {
            if (i % 2 == 1) {
                val.push_back(sum * 4);
                dict.push_back(dicto[i - 1] + dicto[i]);
                val.push_back(sum * 5);
                dict.push_back(dicto[i]);
            } else {
                val.push_back(sum * 9);
                dict.push_back(dicto[i - 2] + dicto[i]);
                val.push_back(sum * 10);
                dict.push_back(dicto[i]);
                sum *= 10;
            }
        }
    }
};
