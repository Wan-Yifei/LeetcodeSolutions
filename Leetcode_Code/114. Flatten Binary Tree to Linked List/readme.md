# Solution 
## DFS
### Method 1
Re-create the tree outside, and let the root to be the head of this tree.
### Method 2
Change the tree to linked list in place. Watch that `pre = root`, the `pre` will reference the object of current root, and it will change from all times.
Thus, we will create a `TreeNode` to re-link the dfs part at `root->right`.
