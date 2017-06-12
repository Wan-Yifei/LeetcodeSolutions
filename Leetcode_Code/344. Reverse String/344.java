public class Solution {
    public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length() / 2; ++i) {
            char temp = arr[i];
            arr[i] = arr[s.length() - i - 1];
            arr[s.length() - i - 1] = temp;
        }
        return String.valueOf(arr);
    }  
}
