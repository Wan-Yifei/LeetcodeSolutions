# Solution
## Dynamic Programming
### Steps
We can divide the current situation into: the root node, the left sub-tree, and the right sub-tree.
Since it is completely different trees for different solutions, we will build the left and and right tree respectively with DP.
If we have 3 nodes, the sub-tree will be {0, 2}, {1, 1} or {2, 0}, the summation of number will be 2 since the root node dose not count.
Thus, if we set the middle point `i`, `start` and `end` indexes are defined, then the range of left tree will be `{start, i - 1}`, then the right tree is `{i + 1, end}`.
