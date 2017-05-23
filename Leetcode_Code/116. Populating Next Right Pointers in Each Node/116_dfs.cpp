/**
 * Definition for binary tree with next pointer.
 * struct TreeLinkNode {
 *  int val;
 *  TreeLinkNode *left, *right, *next;
 *  TreeLinkNode(int x) : val(x), left(NULL), right(NULL), next(NULL) {}
 * };
 */
class Solution {
public:
    void connect(TreeLinkNode *root) {
        connect_dfs(root, 0);
    }

private:
    vector<TreeLinkNode *> treeLNheads;

    void connect_dfs(TreeLinkNode *root, int layer) {
        if (!root) return;
        if (treeLNheads.size() <= layer)
            treeLNheads.push_back(root);
        else {
            treeLNheads[layer]->next = root;
            treeLNheads[layer] = root;
        }
        connect_dfs(root->left, layer + 1);
        connect_dfs(root->right, layer + 1);
    }
};
