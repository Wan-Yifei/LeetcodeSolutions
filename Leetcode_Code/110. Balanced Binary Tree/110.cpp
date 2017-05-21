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
    bool isBalanced(TreeNode *root) {
        isBalanced_dfs(root);
        return test;
    }

private:
    bool test = true;

    int isBalanced_dfs(TreeNode *root) {
        if (!root) return 0;
        if (test) {
            int h1 = isBalanced_dfs(root->left);
            int h2 = isBalanced_dfs(root->right);
            if (abs(h1 - h2) > 1) test = false;
            return max(h1, h2) + 1;
        }
        return 0;
    }
};
