# Solution 
## DFS
**Watch:** to count the depth of leaf node, we need to do the condition at root's next node, and root is not included (eliminate the root node bug).<br>
In this problem, I used a global variable to terminate the excessive traverse of trees deeper than current minimum depth.
### Model
```java
TYPE dfs(TreeNode root) {
    if (root.left == null && root.right == null)
        /*Termination Condition*/
        return;
    if (root.right == null) minDepth_dfs(root.left);
    if (root.left == null) minDepth_dfs(root.right);
}
```
Or,
```java
TYPE dfs(TreeNode root) {
    if (root.left == null && root.right == null)
        /*Termination Condition*/
        return;
    if (root.left != null) minDepth_dfs(root.left);
    if (root.right != null) minDepth_dfs(root.right);
}
```
Better Model:
```cpp
TYPE dfs(TreeNode *root) {
    /*null node*/
    if(root == NULL) return;
    /*leaf node terminate condition*/
    if(root->left == NULL && root->right == NULL) return;
    /*half null condition*/
    dfs(root->left);
    dfs(root->right);
}
```
Or,
```cpp
TYPE dfs(TreeNode *root) {
    /*null node*/
    if(root == NULL) return;
    /*half null condition*/
    if(root->left != NULL) dfs(root->left);
    if(root->right != NULL) dfs(root->right);
     /*leaf node terminate condition*/
     return;
}
```

## BFS
Terminate condition set at the tree traverse firstly reach the leaf node, then return a depth.
