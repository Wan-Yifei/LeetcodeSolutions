# Solution
## DFS
Create the function that the return value to be the branch path sum from that TreeNode, it will give up the path tail which decrease the path sum value.

Then the maximum path will aways appear at: 
* just one branch, since other branches path sum is negative
* two branches path
* something from its result somewhere in its sub-tree, and this result will pass all the way
