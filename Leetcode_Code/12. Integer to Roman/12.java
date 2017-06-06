public class Solution {
    public String intToRoman(int num) {
        if (num >= 4000000 || num < 0) return "error";
        RomanNumVectors();
        StringBuilder result = new StringBuilder();
        for (int i = dict.size() - 1; i >= 0; --i) {
            if (num >= val.get(i)) {
                int count = num / val.get(i);
                num %= val.get(i);
                for (int j = 0; j < count; ++j) {
                    result.append(dict.get(i));
                }
            }
        }
        return result.toString();
    }

    private void RomanNumVectors() {
        List<String> dicto = new ArrayList<>(Arrays.asList("I", "V", "X", "L", "C", "D", "M", "v", "x", "l", "c", "d", "m"));
        int sum = 1;
        for (int i = 1; i < dicto.size(); ++i) {
            if (i % 2 == 1) {
                val.add(sum * 4);
                dict.add(dicto.get(i - 1) + dicto.get(i));
                val.add(sum * 5);
                dict.add(dicto.get(i));
            } else {
                val.add(sum * 9);
                dict.add(dicto.get(i - 2) + dicto.get(i));
                val.add(sum * 10);
                dict.add(dicto.get(i));
                sum *= 10;
            }
        }
    }

    private List<String> dict = new ArrayList<>(Collections.singletonList("I"));
    private List<Integer> val = new ArrayList<>(Collections.singletonList(1));
}
