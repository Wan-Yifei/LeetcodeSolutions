# Solution
## DP
### Definition
The constraint is generally applied recursively to every subtree. That is, the tree is only balanced if:
* The left and right subtrees' heights differ by at most one, AND
* The left subtree is balanced, AND
* The right subtree is balanced

According to this, the next tree is balanced:
```
     A
   /   \
  B     C  
 /     / \  
D     E   F  
     /  
    G  
```
The next one is not balanced because the subtrees of C differ by 2 in their height:
```
     A
   /   \
  B     C   <-- difference = 2
 /     /
D     E  
     /  
    G  
```
### Method
If the hight difference is larger than 1, then terminate the program (for faster algorithm), test to be false.
