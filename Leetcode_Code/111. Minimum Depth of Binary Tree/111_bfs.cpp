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
        queue<TreeNode *> Q;
        Q.push(root);
        int depth = 1;
        while (!Q.empty()) {
            int size = (int) Q.size();
            for (int i = 0; i < size; ++i) {
                TreeNode *head = Q.front();
                Q.pop();
                if (!head->left && !head->right) return depth;
                if (head->left) Q.push(head->left);
                if (head->right) Q.push(head->right);
            }
            depth++;
        }
        return depth;
    }
};
