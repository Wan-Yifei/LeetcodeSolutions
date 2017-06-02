public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxl = 0, start = 0;
        Map<Character, Integer> dict = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            if (dict.get(s.charAt(i)) == null || dict.get(s.charAt(i)) < start) {
                maxl = Math.max(maxl, i - start + 1);
            } else {
                start = dict.get(s.charAt(i)) + 1;
            }
            dict.put(s.charAt(i), i);
        }
        return maxl;
    }
}
