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
    TreeNode *buildTree(vector<int> &preorder, vector<int> &inorder) {
        if (preorder.size() == 0 && preorder.size() != inorder.size()) return NULL;
        return buildTree_dfs(preorder, inorder, Pnow, (int) preorder.size());
    }

private:
    int Find(vector<int> &v, int start, int end, int value) {
        int i = start;
        for (; i <= end; ++i) {
            if (v[i] == value)
                break;
        }
        return i;
    }

    /*global counter for pre-order traversal array*/
    int Pnow = 0;

    TreeNode *buildTree_dfs(vector<int> &preorder, vector<int> &inorder,
                            int Istart, int Iend) {
        if (Istart > Iend || Pnow >= preorder.size()) return NULL;
        TreeNode *root = new TreeNode(preorder[Pnow]);
        /*int mid = find(inorder.begin() + Istart, inorder.begin() + Iend, preorder[Pnow]);*/
        int mid = Find(inorder, Istart, Iend, preorder[Pnow]);
        Pnow++;
        root->left = buildTree_dfs(preorder, inorder, Istart, mid - 1);
        root->right = buildTree_dfs(preorder, inorder, mid + 1, Iend);
        return root;

    }
};
