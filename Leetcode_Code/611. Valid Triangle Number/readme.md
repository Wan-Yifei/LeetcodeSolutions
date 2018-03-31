# Solution
First two are two for loop (we can optimize this algorithm by getting second parameter by the largest number to pass case).
The final one use dichotomy algorithm.
## Dichotomy Algorithm
```python
idx = [0, 1, 2, 3, 4, 5, 6,  7,  8,  9]
arr = [1, 3, 5, 4, 7, 8, 10, 15, 18, 21]
arr = sorted(arr)
target = 19
start = 0
end = len(arr)
while start < end:
    mid = (start + end) // 2
    if arr[mid] < target:
        start = mid + 1
    else:
        end = mid
    print(start, end, arr[end - 1])

```
