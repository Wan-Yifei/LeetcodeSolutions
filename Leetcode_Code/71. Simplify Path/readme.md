# Solution
## Use Stack
Meet '/' or '\' then we will check. The starting point target at index `i + 1`, however, if `start = i` (index `i` now, we will ignore this case since it is multiple '//' or '\\').
If we have dots but there is no letter with them, we will do operation. otherwise we will push this path result.
