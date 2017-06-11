class Solution {
public:
    vector<string> restoreIpAddresses(string s) {
        if (s.length() >= 4)
            restoreIpAddresses_dfs(s, 0, 0);
        return result;
    }

private:
    vector<string> result;
    vector<int> l;

    void restoreIpAddresses_dfs(string s, int start, int num) {
        if (start >= s.length() && l.size() == 4) {
            string sb = "";
            for (int i = 0; i < l.size(); ++i) {
                sb += to_string(l[i]);
                if (i < l.size() - 1)
                    sb += ".";
            }
            result.push_back(sb);
            return;
        }
        if (4 - num > s.length() - start || (4 - num) * 3 < s.length() - start)
            return;
        int temp;
        for (int i = 1; i <= 3; ++i) {
            if (start <= s.length() - i) {
                temp = stoi(s.substr((unsigned long) start, i));
                int testNum = (i == 1 ? 0 : (int) powf(10, i - 1));
                if (temp >= testNum && temp < 256) {
                    l.push_back(temp);
                    restoreIpAddresses_dfs(s, start + i, num + 1);
                    l.pop_back();
                }
            }
        }
    }
};
