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
    bool hasPathSum(TreeNode *root, int sum) {
        if (!root) return false;
        hasPathSum_dfs(root, sum);
        return result;
    }

private:
    bool result = false;

    void hasPathSum_dfs(TreeNode *root, int sum) {
        if (!root->left && !root->right) {
            if (sum == root->val)
                result = true;
            return;
        }
        if (!result) {
            if (root->left) hasPathSum_dfs(root->left, sum - root->val);
            if (root->right) hasPathSum_dfs(root->right, sum - root->val);
        }
    }
};
