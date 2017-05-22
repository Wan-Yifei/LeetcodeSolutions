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
    int minDepth(TreeNode *root) {
        if (!root) return 0;
        minDepth_dfs(root, 1);
        return maxDepth;
    }

private:
    int maxDepth = INT_MAX;

    void minDepth_dfs(TreeNode *root, int depth) {
        if (root->left == NULL && root->right == NULL) {
            maxDepth = min(maxDepth, depth);
            return;
        }
        if (depth <= maxDepth) {
            if (root->left) minDepth_dfs(root->left, depth + 1);
            if (root->right) minDepth_dfs(root->right, depth + 1);
        }
    }
};
