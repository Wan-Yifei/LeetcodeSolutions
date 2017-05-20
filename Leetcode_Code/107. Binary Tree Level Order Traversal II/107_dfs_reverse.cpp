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
    vector<vector<int>> levelOrderBottom(TreeNode *root) {
        vector<vector<int>> result;
        if (!root) return result;
        queue<TreeNode *> Q;
        Q.push(root);
        while (!Q.empty()) {
            int size = (int) Q.size();
            vector<int> layerElement;
            for (int i = 0; i < size; ++i) {
                TreeNode *head = Q.front();
                Q.pop();
                layerElement.push_back(head->val);
                if (head->left) Q.push(head->left);
                if (head->right) Q.push(head->right);
            }
            result.insert(result.begin(), layerElement);
        }
        return result;
    }
};
