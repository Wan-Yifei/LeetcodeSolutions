# Solution
## dfs
Use dfs to build string, the element split by " ", and null TreenNode is represented by "#".
The decode part is also built by dfs, the dfs function will return a TreeNode at its level in the end, the preorder code body is there to decode the element.
The "#", and the last element will decode as None and return to previous level.
