class Solution {
public:
    int myAtoi(string str) {
        if (str.size() == 0) 0;
        int startindex = 0, sign = 1;
        long long sum = 0;
        while (str[startindex] == ' ') startindex++;
        if (str[startindex] == '-' || str[startindex] == '+') {
            sign = str[startindex] == '-' ? -1 : 1;
            if (str[startindex + 1] > '9' || str[startindex + 1] < '0')
                return 0;
            startindex++;
        }
        for (int i = startindex; i < str.size(); ++i) {
            if (str[i] <= '9' && str[i] >= '0') {
                sum = 10 * sum + (str[i] - '0');
                if (sum * sign < INT_MIN) return INT_MIN;
                if (sum *sign > INT_MAX) return INT_MAX;
            } else break;
        }
        return (int) (sum * sign);
    }
};
