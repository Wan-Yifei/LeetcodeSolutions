# Solution
Let's count
```c++
(2 * n - 2) * m + 0; i = 0
(2 * n - 2) * m + 1, (2 * n - 2) * (m + 1) - 1
(2 * n - 2) * m + 2, (2 * n - 2) * (m + 1) - 2
(2 * n - 2) * m + i, (2 * n - 2) * (m + 1) - i
...i = 2
```
Where `n` is numRows, `m` and `i` is iteration number
