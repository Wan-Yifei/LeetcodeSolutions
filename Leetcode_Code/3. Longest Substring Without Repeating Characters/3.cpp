class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int maxl = 0, start = 0;
        map<char, int> dict;
        for (int i = 0; i < s.length(); ++i) {
            if (dict[s[i]] == 0 || dict[s[i]] < start) {
                maxl = max(maxl, i - start + 1);
            } else {
                start = dict[s[i]];
            }
            dict[s[i]] = i + 1;
        }
        return maxl;
    }
};
