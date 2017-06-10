# Solution
# DP
Same with stair combination problem with one or two steps, this problem is also consider one and two characters but with some conditions.

Conditions:
* if last two digits is from 10 to 26, then we consider this can be decoded
* if last one digits is from 1 to 9, we consider this is valid to be decoded

Boundary conditions:
* `dp[0] = dp[1] = 1`

Warning condition: when first letter is 0, it is false condition.
