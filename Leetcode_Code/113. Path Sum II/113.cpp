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
    vector<vector<int>> pathSum(TreeNode *root, int sum) {
        if (!root) return result;
        vector<int> Stack;
        pathSum_dfs(root, Stack, sum);
        return result;
    }

private:
    vector<vector<int>> result;

    void pathSum_dfs(TreeNode *root, vector<int> &Stack, int sum) {
        if (!root->left && !root->right) {
            Stack.push_back(root->val);
            if (sum == root->val) result.push_back(Stack);
            Stack.pop_back();
        }
        Stack.push_back(root->val);
        if (root->left) pathSum_dfs(root->left, Stack, sum - root->val);
        if (root->right) pathSum_dfs(root->right, Stack, sum - root->val);
        Stack.pop_back();
    }
};
