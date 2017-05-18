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
    void recoverTree(TreeNode *root) {
        recoverTree_dfs(root);
        if (wrongNode, secondWNode) swap(wrongNode->val, secondWNode->val);
    }

private:
    TreeNode *lastNode = NULL;
    TreeNode *wrongNode = NULL;
    TreeNode *secondWNode = NULL;

    void swap(int &a, int &b) {
        int temp = a;
        a = b;
        b = temp;
    };

    void recoverTree_dfs(TreeNode *root) {
        if (!root) return;
        recoverTree_dfs(root->left);
        if (lastNode != NULL && root->val <= lastNode->val) {
            if (wrongNode == NULL) {
                wrongNode = lastNode;
            }
            if (wrongNode != NULL) {
                secondWNode = root;
            }
        }
        lastNode = root;
        recoverTree_dfs(root->right);
    }
};
