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
    bool isValidBST(TreeNode *root) {
        if (!root) return true;
        bool Boolean = true;

        isValidBST_dfs(root, Boolean);
        return Boolean;
    }

private:
    TreeNode *lastNode = NULL;

    void isValidBST_dfs(TreeNode *root, bool &Boolean) {
        if (!root) return;
        isValidBST_dfs(root->left, Boolean);
        if (lastNode != NULL && root->val <= lastNode->val) {
            Boolean = false;
        } else {
            lastNode = root;
            isValidBST_dfs(root->right, Boolean);
        }
    }
};
