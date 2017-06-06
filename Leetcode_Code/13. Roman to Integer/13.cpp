class Solution {
public:
    int romanToInt(string s) {
        if (s.length() == 0) return 0;
        vector<char> dicto = {'I', 'V', 'X', 'L', 'C', 'D', 'M', 'v', 'x', 'l', 'c', 'd', 'm'};
        map<char, int> dict;
        int sum = 1;
        dict['I'] = 1;
        for (int i = 1; i < dicto.size(); ++i) {
            if (i % 2 == 1) {
                sum *= 5;
                dict[dicto[i]] = sum;
            } else {
                sum *= 2;
                dict[dicto[i]] = sum;
            }
        }
        sum = 0;
        sum += dict[s[0]];
        for (int i = 1; i < s.length(); ++i) {
            int pre = dict[s[i - 1]], now = dict[s[i]];
            if (pre < now) sum = sum + now - 2 * pre;
            else sum += now;
        }
        return sum;
    }
};
