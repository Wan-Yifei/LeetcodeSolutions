public class Solution {
    public String numberToWords(int num) {
        if (num == 0)
            return "Zero";
        List<String> resArr = new ArrayList<>();
        int index = 0;
        while (num != 0) {
            int threeDigits = num - num / 1000 * 1000;
            if (threeDigits != 0)
                resArr.add(0, moreArr[index]);
            resArr.addAll(0, smallNumberToWords(threeDigits));
            num /= 1000;
            index++;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < resArr.size(); ++i) {
            if (resArr.get(i) != "") {
                result.append(resArr.get(i));
                result.append(" ");
            }
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }

    private String[] onesArr = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
    private String[] teensArr = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen" };
    private String[] tensArr = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
    private String[] moreArr = { "", "Thousand", "Million", "Billion", "Trillion" };

    private List<String> smallNumberToWords(int num) {
        int[] digits = new int[3];
        for (int i = 0; i < 3; ++i) {
            digits[2 - i] = num - num / 10 * 10;
            num /= 10;
        }
        List<String> resArr = new ArrayList<>();
        if (digits[0] != 0) {
            resArr.add(onesArr[digits[0]]);
            resArr.add("Hundred");
        }
        if (digits[1] == 1) {
            resArr.add(teensArr[digits[2]]);
        } else {
            if (digits[1] > 1) {
                resArr.add(tensArr[digits[1]]);
            }
            resArr.add(onesArr[digits[2]]);
        }
        return resArr;
    }
}
