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
    vector<vector<int>> zigzagLevelOrder(TreeNode *root) {
        if (root)
            zigzagLevelOrder_dfs(root, 0);
        return result;
    }

private:
    vector<vector<int>> result;

    void pushFront(vector<int> &v, int x) {
        auto start = v.begin();
        v.insert(start, x);
    }

    void zigzagLevelOrder_dfs(TreeNode *root, int layer) {
        if (!root) return;
        if (result.size() <= layer) result.push_back(vector<int>());
        if (layer % 2 != 0) pushFront(result[layer], root->val);
        else result[layer].push_back(root->val);
        zigzagLevelOrder_dfs(root->left, layer + 1);
        zigzagLevelOrder_dfs(root->right, layer + 1);
    }
};
