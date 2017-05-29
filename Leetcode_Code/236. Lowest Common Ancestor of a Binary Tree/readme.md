# Solution
## DP
Post-order traversal; keep track of both sides of branches whether contains the node. If both two branches or eather branch and its root contains the TreeNode, we will say this root is the result.
Then after this we will terminate all calculation (for speedup).
