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
    int last = INT_MIN;
    bool count = false;

    void isValidBST_dfs(TreeNode *root, bool &Boolean) {
        if (!root) return;
        isValidBST_dfs(root->left, Boolean);
        int current = root->val;
        if (current <= last && count) {
            Boolean = false;
        }
        count = true;
        // cout << current << " " << last << endl;
        last = current;
        isValidBST_dfs(root->right, Boolean);
    }
};
