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
    void flatten(TreeNode *root) {
        if (!root) return;
        flatten_dfs(root);
        *root = *head;
    }

private:
    TreeNode *head, *now, *pre = NULL;

    void flatten_dfs(TreeNode *root) {
        if (!root) return;
        now = new TreeNode(root->val);
        pre ? pre->right = now : head = now;
        pre = now;
        flatten_dfs(root->left);
        flatten_dfs(root->right);
    }
};
