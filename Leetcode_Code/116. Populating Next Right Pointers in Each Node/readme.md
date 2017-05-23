# Solution
## DFS
It is pre-order traversal.
If layer appears new, then push this to the heads vectors. Then, if this layer element appear again, then connect previous head to this node.
In c++, we could use reference to pass this variable in the function. However in OOP, we need private global variable.
Watch in Java, `List<>` will change value by function `.set(index, value)`.
## BFS
Each layer please connect elements.
