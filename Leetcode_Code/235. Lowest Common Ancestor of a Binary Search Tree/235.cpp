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
    TreeNode *lowestCommonAncestor(TreeNode *root, TreeNode *p, TreeNode *q) {
        if (!root) return NULL;
        int mx = max(p->val, q->val);
        int mn = min(p->val, q->val);
        while (true) {
            int value = root->val;
            if (value <= mx && value >= mn) return root;
            if (value < mn) root = root->right;
            if (value > mx) root = root->left;
        }
    }
};
