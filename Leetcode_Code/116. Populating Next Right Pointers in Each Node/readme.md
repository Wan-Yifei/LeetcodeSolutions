# Solution
## DFS
It is pre-order traversal.
If layer appears new, then push this to the heads vectors. Then, if this layer element appear again, then connect previous head to this node.
Watch in `Java`, `List<>` will change value by function `.set(index, value)`.
In c++, we could use reference to pass this variable in the function. However in OOP, we need private global variable.
## BFS
Each layer please connect elements.