public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subsets_dfs(nums, 0);
        return result;
    }

    private Stack<Integer> stack = new Stack<>();
    private List<List<Integer>> result = new ArrayList<>();

    private void subsets_dfs(int[] nums, int n) {
        result.add(new ArrayList<>(stack));
        for (int i = n; i < nums.length; ++i) {
            if (i > n && nums[i - 1] == nums[i]) continue;
            stack.add(nums[i]);
            subsets_dfs(nums, i + 1);
            stack.pop();
        }
    }
}
