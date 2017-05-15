# Solution
## a. Recursion
```java
start:
new stack
dfs(Treehead)
  if left tree is not null
    dfs(left tree head)
    
 /*inorder traverse part*/ 
  Add head value to the stack
    
  if right tree is not null
    dfs(right tree head)
end
```
