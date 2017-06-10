# Solution
# DP
The method is shown in [link](https://www.youtube.com/watch?v=We3YDTzNXEk).

The insert and delete can be treated as same operation that one word will insert. In the DP table, it goes down or right. The replace operation is goes bottom-right direction.

Since we only consider two lines to do operation, we can give the memory with minimum word length times 2 (namely: `O(min(m, n) * 2)`, where `m` and `n` are the length of two words). Time complexity is `O(m * n)`.
