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
        vector<TreeNode *> err;
        if (n < 1) return err;
        return generateSubTree(1, n);
    }

private:
    vector<TreeNode *> generateSubTree(int start, int end) {
        vector<TreeNode *> result;
        if (end < start) {
            result.push_back(NULL);
            return result;
        }
        for (int i = start; i <= end; ++i) {
            for (TreeNode *subL: generateSubTree(start, i - 1)) {
                for (TreeNode *subR:generateSubTree(i + 1, end)) {
                    TreeNode *head = new TreeNode(i);
                    head->left = subL;
                    head->right = subR;
                    result.push_back(head);
                }
            }
        }
        return result;
    }
};
