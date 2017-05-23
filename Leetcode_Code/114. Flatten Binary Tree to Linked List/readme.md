# Solution 
## DFS
### Method 1
Re-create the tree outside, and let the root to be the head of this tree.
### Method 2
Change the tree to linked list in place. Watch that `pre = root`, the `pre` will reference the object of current root, and it will change from all times.
Thus, we will create a `TreeNode` to re-link the dfs part at `root->right`.
### Method 3
Understand the [Link](http://bangbingsyb.blogspot.com/2014/11/leetcode-flatten-binary-tree-to-linked.html) Method 2. Watch the return value aways the right end TreeNode of this root.
## No Recursion
Understand the [Link](http://blog.csdn.net/ebowtang/article/details/51647971) Method 2. Watch this method to flatten the tree step by step; layer by layer.
