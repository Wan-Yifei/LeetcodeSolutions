# Solution
## DFS
This can be solved by pre-order traversal, then we will keep track of layers. Then push back the corresponding numbers into 2d array.
Watch that the 2d array will not be initialled, we will prepare a place where the number will be stored, 
which is if the size of array minus 1 is less than layer numbers, we will prepare the 1d array inside the 2d array.
## BFS
### c++ model
``` cpp
TYPE Function(TreeNode *root) {
    /*exception handling*/
    if (!root) return;
    /*build a queue*/
    queue<TreeNode *> Q;
    /*push a root in the queue to start BFS*/
    Q.push(root);
    /*BFS Body*/
    while (!Q.empty()) {
        /*Keep down this number to be fix at this level*/
        int size = (int) Q.size();
        /*Loop this level elements*/
        for (int i = 0; i < size; ++i) {
            /*Get each element and pop from the queue*/
            TreeNode *head = Q.front();
            Q.pop();
            
            /**do operation for each element for this level*/
            
            /*Loop through tree branches from this node*/
            if (head->left) Q.push(head->left);
            if (head->right) Q.push(head->right);
        };
        
        /**Do operation for each level*/
        
    }
    /**return some result*/
    return;
}
```
### java model
```java
public TYPE Function(TreeNode root) {
    if (root == null) return;
    Queue<TreeNode> Q = new LinkedList<>();
    Q.add(root);
    /*start bfs*/
    while (!Q.isEmpty()) {
        int size = Q.size();
        for (int i = 0; i < size; ++i) {
            TreeNode head = Q.poll();
            /**do operation for each element for this level*/
            
            /*Loop through tree branches from this node*/
            if (head.left != null) Q.add(head.left);
            if (head.right != null) Q.add(head.right);
        }
        
        /**Do operation for each level*/
        
    }
    /**return some result*/
    return result;
}
```
