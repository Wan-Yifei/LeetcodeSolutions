public class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        int left = 0;
        int[] num = new int[nums.length + 1];
        for (int i = 0; i < nums.length; ++i) num[i] = nums[i];
        num[nums.length] = num[nums.length - 1] - 1;
        List<String> result = new ArrayList<>();
        for (int i = 1; i < num.length; ++i) {
            while (i < num.length && num[i] == num[i - 1] + 1) i++;
            StringBuilder sb = new StringBuilder();
            if (i - 1 == left)
                sb.append(num[left]);
            else {
                sb.append(num[left]);
                sb.append("->");
                sb.append(num[i - 1]);
            }
            left = i;
            result.add(sb.toString());
        }
        return result;
    }
}
