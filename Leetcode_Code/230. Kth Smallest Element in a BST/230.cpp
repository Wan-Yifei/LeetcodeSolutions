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
    int kthSmallest(TreeNode *root, int k) {
        int count = k, mini = INT_MIN;
        kthSmallest_dfs(root, count, mini);
        return mini;
    }

private:
    void kthSmallest_dfs(TreeNode *root, int &count, int &mini) {
        if (!root) return;
        if (count > 0)
            kthSmallest_dfs(root->left, count, mini);
        if (mini <= root->val && count > 0) {
            count--;
            mini = root->val;
        }
        if (count > 0)
            kthSmallest_dfs(root->right, count, mini);

    }
};
