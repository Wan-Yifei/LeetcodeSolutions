public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        subsets_dfs(nums, 0);
        return res;
    }

    private List<List<Integer>> res = new ArrayList<>();

    private Stack<Integer> stack = new Stack<>();

    private void subsets_dfs(int[] nums, int n) {
        res.add(new ArrayList<Integer>(stack));
        for (int i = n; i < nums.length; ++i) {
            stack.add(nums[i]);
            subsets_dfs(nums, i + 1);
            stack.pop();
        }
    }
}
