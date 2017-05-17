# Solution
## a. Inorder Traversal
The inorder traversal could get the left, root and right order of sequences. 
We will make this sequence is the right always greater than left.
However, this program contains problem, because of we will traverse the whole tree. The `ii` program of c++ will not run the rest of code if the false condition appear. Unfortunately, the leetcode judging does not show any speedup.
