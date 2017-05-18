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
    vector<vector<int>> levelOrder(TreeNode *root) {
        if (root)
            levelOrder_dfs(root, 0);
        return result;
    }

private:
    vector<vector<int>> result;

    void levelOrder_dfs(TreeNode *root, int layer) {
        if (!root) return;
        if (result.size() < layer + 1) result.push_back(vector<int>());
        result[layer].push_back(root->val);
        levelOrder_dfs(root->left, layer + 1);
        levelOrder_dfs(root->right, layer + 1);
    }
};
