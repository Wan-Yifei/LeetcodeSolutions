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
            vector<TreeNode *> subL = generateSubTree(start, i - 1);
            vector<TreeNode *> subR = generateSubTree(i + 1, end);
            for (int l = 0; l < subL.size(); ++l) {
                for (int r = 0; r < subR.size(); ++r) {
                    TreeNode *head = new TreeNode(i);
                    head->left = subL[l];
                    head->right = subR[r];
                    result.push_back(head);
                }
            }
        }
        return result;
    }
};
