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
    bool isSymmetric(TreeNode *root) {
        if (!root) return true;
        isSymmetric_dfs(root->left, root->right);
        return result;
    }

private:
    bool result = true;

    void isSymmetric_dfs(TreeNode *l, TreeNode *r) {
        if (!l || !r) {
            if (l == r) return;
            else {
                result = false;
                return;
            }
        }
        if (l->val == r->val) {
            isSymmetric_dfs(l->left, r->right);
            isSymmetric_dfs(l->right, r->left);
        } else result = false;
    }
};
