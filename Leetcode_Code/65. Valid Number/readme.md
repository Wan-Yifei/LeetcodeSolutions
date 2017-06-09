# Solution
It is not too hard, but with too many cases to consider. If we combine the problem with only one for loop, it is too hard to understand. If we divided the problem into several sub-problem, it will cost a tiny more spaces and some time for checking conditions. My solution is also `O(n)` time complexity, but to get the index of 'e' cost the additional time (otherwise it is too hard for the condition).

Steps:
* Trim the head and tail
* Contains letter 'e'? if so, divide left and right number (left should be number, right should be integer); no 'e' string should be number
* Build number function and return its type
