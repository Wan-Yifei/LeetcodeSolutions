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
        hasPathSum_dfs(root, 0, sum);
        return result;
    }

private:
    bool result = false;

    void hasPathSum_dfs(TreeNode *root, int sumnow, int sum) {
        if (!root->left && !root->right) {
            sumnow += root->val;
            if (sum == sumnow)
                result = true;
            return;
        }
        if (root->left) hasPathSum_dfs(root->left, sumnow + root->val, sum);
        if (root->right) hasPathSum_dfs(root->right, sumnow + root->val, sum);
    }
};
