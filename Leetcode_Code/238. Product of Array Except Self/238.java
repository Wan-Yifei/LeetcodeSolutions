public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] previous = new int[nums.length];
        int[] after = new int[nums.length];
        int[] result = new int[nums.length];
        previous[0] = 1;
        for (int i = 1; i < nums.length; ++i) {
            previous[i] = previous[i - 1] * nums[i - 1];
        }
        after[nums.length - 1] = 1;
        for (int i = nums.length - 1; i > 0; --i) {
            after[i - 1] = after[i] * nums[i];
        }
        for (int i = 0; i < nums.length; ++i) {
            result[i] = previous[i] * after[i];
        }
        return result;
    }
}
