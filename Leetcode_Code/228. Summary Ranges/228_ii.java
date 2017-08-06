public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length < 1) return result;
        int left = 0, i = 0;
        while (i < nums.length) {
            if (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) i++;
            else {
                StringBuilder sb = new StringBuilder();
                if (left == i) sb.append(nums[left]);
                else {
                    sb.append(nums[left]);
                    sb.append("->");
                    sb.append(nums[i]);
                }
                result.add(sb.toString());
                i++;
                left = i;
            }
        }
        return result;
    }
}  
