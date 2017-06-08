public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0)
            return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; ++i) {
            char[] stringNow = strs[i].toCharArray();
            Arrays.sort(stringNow);
            String key = String.valueOf(stringNow);
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
