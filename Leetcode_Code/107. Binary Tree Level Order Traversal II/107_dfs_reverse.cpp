class Solution {
public:
    vector<vector<int>> levelOrderBottom(TreeNode *root) {
        if (root) {
            levelOrderBottom_dfs(root, 0);
            reverse(result.begin(), result.end());
        }
        return result;
    }

private:
    vector<vector<int>> result;

    void levelOrderBottom_dfs(TreeNode *root, int layer) {
        if (!root) return;
        if (result.size() <= layer) result.push_back(vector<int>());
        result[layer].push_back(root->val);
        levelOrderBottom_dfs(root->left, layer + 1);
        levelOrderBottom_dfs(root->right, layer + 1);
    }
};
