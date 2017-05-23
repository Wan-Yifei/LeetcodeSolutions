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
        if (pre) {
            pre->left = NULL;
            pre->right = root;
        }
        pre = root;
        TreeNode *temp = root->right;
        flatten(root->left);
        flatten(temp);
    }

private:
    TreeNode *pre = NULL;
};

