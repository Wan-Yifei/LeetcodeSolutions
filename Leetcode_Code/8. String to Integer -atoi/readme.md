# Solution
Steps:
- The Margin handling: if start is space then ignore it, if end is also space, we will terminate calculation.
- The sign handling: if the first sign is '-', but second is also sign, we will return error.
- The Min-Max handling: use `long long` type, if sum is greater than INT_MAX then break loop, then return a result.
