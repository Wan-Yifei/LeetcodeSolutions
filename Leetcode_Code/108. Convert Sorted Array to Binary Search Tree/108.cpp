/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    TreeNode *sortedArrayToBST(vector<int> &nums) {
        if (nums.size() == 0) return NULL;
        return sortedArrayToBST_dfs(nums, 0, (int) (nums.size() - 1));
    }

private:
    TreeNode *sortedArrayToBST_dfs(vector<int> &nums, int start, int end) {
        if (end < start) return NULL;
        int mid = start + (end - start) / 2;
        TreeNode *root = new TreeNode(nums[mid]);
        root->left = sortedArrayToBST_dfs(nums, start, mid - 1);
        root->right = sortedArrayToBST_dfs(nums, mid + 1, end);
        return root;
    }
};
