/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
 /*This solution count the root node as path*/
class Solution {
public:
    int minDepth(TreeNode *root) {
        minDepth_dfs(root, 0);
        return maxDepth;
    }

private:
    int maxDepth = INT_MAX;

    void minDepth_dfs(TreeNode *root, int depth) {
        if (!root) {
            maxDepth = min(maxDepth, depth);
            return;
        }
        if (depth <= maxDepth) {
            minDepth_dfs(root->left, depth + 1);
            minDepth_dfs(root->right, depth + 1);
            return;
        }
        return;
    }
};
