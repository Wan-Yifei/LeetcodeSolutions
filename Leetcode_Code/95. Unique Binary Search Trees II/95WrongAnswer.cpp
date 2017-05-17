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
    vector<TreeNode *> generateTrees(int n) {
        vector<TreeNode *> result;
        if (n < 1) {
            result.push_back(NULL);
            return result;
        }
        if (n == 1) {
            TreeNode *root = new TreeNode(1);
            result.push_back(root);
            return result;
        }
        for (int i = 2; i <= n; ++i) {
            result.clear();
            for (int j = 0; j < i; ++j) {
                vector<TreeNode *> leftTree = generateTrees(j);
                vector<TreeNode *> rightTree = generateTrees(i - j - 1);
                for (int k = 0; k < leftTree.size(); ++k) {
                    for (int l = 0; l < rightTree.size(); ++l) {
                        TreeNode *root = new TreeNode(j);
                        root->left = leftTree[k];
                        root->right = rightTree[l];
                        result.push_back(root);
                    }
                }
            }
        }
        return result;
    }
};
