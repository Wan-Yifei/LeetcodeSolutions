# Solution
## Build-in Function
## Slow Method
Check one by one.
## KMP Algorithm
```java
private int[] PrefixFunction(String s) {
    char[] S = s.toCharArray();
    int[] p = new int[S.length];
    int j = 0;
    for (int i = 1; i < S.length; i++) {
        while (j > 0 && S[j] != S[i])
            j = p[j - 1];
        if (S[j] == S[i])
           j++;
        p[i] = j;
   }
    return p;
}
```
```cpp
vector<int> PrefixFunction(string S) {
    vector<int> p(S.size());
    int j = 0;
    for (int i = 1; i < (int) S.size(); i++) {
        while (j > 0 && S[j] != S[i])
            j = p[j - 1];

        if (S[j] == S[i])
            j++;
        p[i] = j;
    }   
    return p;
}
```
