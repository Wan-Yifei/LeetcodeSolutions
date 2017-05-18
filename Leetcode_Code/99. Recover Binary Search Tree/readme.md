# Solution
Use the inorder traversal to create the sequence. In order to find the wrong order, we need to track the last node.<br>
For example: [0, **5**, 2, 3, 4, **1**, 6], the 1 and 5 are swaped. The first wrong number drop happens at 2, and previous number is 5
as the first wrong node. The second wrong drop happen at 1, then this root node is the second wrong node.<br>
Another Example: [0, **2**, **1**, 3], this wrong drop happen at 1, then the first wrong node is 2, and second wrong node will immediately swith to this number. 
* Last node's value is greater than this node (compare happens in the second node traversal)
* The wrong number drop happens, the wrong node happens at previous node, the second wrong number candidate will target at this point
* If another second wrong node happens, then target root as second wrong node
