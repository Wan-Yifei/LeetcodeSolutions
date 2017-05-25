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
    int maxPathSum(TreeNode *root) {
        if (!root) return 0;
        int result = INT_MIN;
        findMaxPathSum(root, result);
        return result;
    }

private:
    int findMaxPathSum(TreeNode *root, int &result) {
        if (!root) return 0;
        int suml = findMaxPathSum(root->left, result);
        int sumr = findMaxPathSum(root->right, result);
        int mx = max(0, max(suml, sumr)) + root->val;
        result = max(result, suml + sumr + root->val);
        return mx;
    }
};
