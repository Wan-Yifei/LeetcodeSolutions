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
    if (root.right == null) minDepth_dfs(root.left, depth + 1);
    if (root.left == null) minDepth_dfs(root.right, depth + 1);
}
```
Or,
```java
TYPE dfs(TreeNode root) {
    if (root.left == null && root.right == null)
        /*Termination Condition*/
        return;
    if (root.left != null) minDepth_dfs(root.left, depth + 1);
    if (root.right != null) minDepth_dfs(root.right, depth + 1);
}
```
