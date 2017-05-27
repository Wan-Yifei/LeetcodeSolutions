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
    vector<int> rightSideView(TreeNode *root) {
        vector<int> result;
        rightSideView_dfs(root, 0, result);
        return result;
    }

private:
    void rightSideView_dfs(TreeNode *root, int layer, vector<int> &result) {
        if (!root) return;
        if (result.size() <= layer) result.push_back(root->val);
        rightSideView_dfs(root->right, layer + 1, result);
        rightSideView_dfs(root->left, layer + 1, result);
    }
};
