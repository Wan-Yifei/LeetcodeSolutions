# Solution
## DFS
It is pre-order traversal.
If layer appears new, then push this to the heads vectors. Then, if this layer element appear again, then connect previous head to this node.
In c++, we could use reference to pass this variable in the function. However in OOP, we need private global variable.
Watch in Java, `List<>` will change value by function `.set(index, value)`.
## BFS
Each layer please connect elements.
## Special Soltuion
Connect the links layer by layer: see the fastest solution:
```java
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        TreeLinkNode parent = root;
        TreeLinkNode current;
        while (parent.left != null) {
            current = parent;
            while (current != null) {
                current.left.next = current.right;
                if (current.next != null) current.right.next = current.next.left;
                current = current.next;
            }
            parent = parent.left;
        }
    }
}
```
