class Solution {
public:
    vector<int> inorderTraversal(TreeNode *root) {
        vector<int> stack;
        if (root == NULL)
            return stack;
        inorderTraversal_DFS(root, stack);
        return stack;
    }

private:
    void inorderTraversal_DFS(TreeNode *head, vector<int> &stack) {
        if (head->left != NULL) inorderTraversal_DFS(head->left, stack);
        stack.push_back(head->val);
        if (head->right != NULL) inorderTraversal_DFS(head->right, stack);
    }
};
