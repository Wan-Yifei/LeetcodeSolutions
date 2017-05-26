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
    vector<int> inorderTraversal(TreeNode *root) {
        inorderTraversal_dfs(root);
        return result;
    }

private:
    vector<int> result;

    void inorderTraversal_dfs(TreeNode *root) {
        if (!root) return;
        inorderTraversal_dfs(root->left);
        result.push_back(root->val);
        inorderTraversal_dfs(root->right);
    }
};
