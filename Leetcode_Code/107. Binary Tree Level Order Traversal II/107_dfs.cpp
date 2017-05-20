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
    vector<vector<int>> levelOrderBottom(TreeNode *root) {
        if (root)
            levelOrderBottom_dfs(root, 0);
        return result;
    }

private:
    vector<vector<int>> result;
    int layers = 0;

    void levelOrderBottom_dfs(TreeNode *root, int layer) {
        if (!root) return;
        if (result.size() <= layer) {
            result.insert(result.begin(), vector<int>());
            layers++;
        };
        result[layers - layer - 1].push_back(root->val);
        levelOrderBottom_dfs(root->left, layer + 1);
        levelOrderBottom_dfs(root->right, layer + 1);
    }
};
