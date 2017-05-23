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
        if (!root) return;
        queue<TreeLinkNode *> Q;
        Q.push(root);
        while (!Q.empty()) {
            int size = (int) Q.size();
            TreeLinkNode *pre = NULL;
            for (int i = 0; i < size; ++i) {
                TreeLinkNode *head = Q.front();
                Q.pop();
                if (pre) pre->next = head;
                pre = head;
                if (head->left) Q.push(head->left);
                if (head->right) Q.push(head->right);
            }
        }
    }
};
