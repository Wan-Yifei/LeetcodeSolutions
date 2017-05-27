# Solution
The value of TreeNode is the number of its complete binary tree until here (for example: flattened tree [1,2,3,4...]).
Target the left most node for `head.left` and `head.right`. 
If right branch's left most value is less than left most value, 
it means the right branch is one layer less than left. Then we will go to check the left sub-tree.
However, if go to right subtree, the previous right branch's left most node is now the left most node, and we do not have to calculate again.
