public class Solution {
    public static String multiply(String num1, String num2) {
        List<Integer> num1L = String2NumArr(num1);
        List<Integer> num2L = String2NumArr(num2);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < num1.length() + num2.length(); ++i)
            result.add(0);
        for (int i = 0; i < num1L.size(); ++i) {
            for (int j = 0; j < num2L.size(); ++j) {
                int multiplyIJ = num1L.get(i) * num2L.get(j), numNow = multiplyIJ + result.get(i + j);
                int ones = numNow % 10, tens = numNow / 10;
                result.set(i + j, ones);
                if (tens != 0)
                    result.set(i + j + 1, tens + result.get(i + j + 1));
            }
        }
        int start = result.size() - 1;
        while (result.get(start) == 0) {
            start--;
            if (start < 0)
                return "0";
        }
        StringBuilder resultString = new StringBuilder();
        for (int i = start; i >= 0; --i) {
            resultString.append(String.valueOf(result.get(i)));
        }
        return resultString.toString();
    }

    private static List<Integer> String2NumArr(String num) {
        List<Integer> result = new ArrayList<>();
        for (int i = num.length() - 1; i >= 0; i--) {
            result.add(num.charAt(i) - '0');
        }
        return result;
    }
}
