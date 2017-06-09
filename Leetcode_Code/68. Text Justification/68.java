public class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        if (words.length == 0 && words.length == 1 && words[0] == "")
            return new ArrayList<>();
        int sum = 0, start = 0, sumlast = 0;
        List<String> result = new ArrayList<>();
        StringBuilder wordNow = new StringBuilder();
        for (int i = 0; i < words.length; ++i) {
            sum += words[i].length();
            int div = i - start;
            if (i < words.length - 1 && sum + words[i + 1].length() + 1 + div > maxWidth || i == words.length - 1) {
                List<Integer> list = spaceIndex(maxWidth - sum, div);
                /*build word*/
                int space = 0, kill = -1;
                for (int j = 0; j <= div; ++j) {
                    wordNow.append(words[start + j]);
                    if (j != div) {
                        space = i == words.length - 1 ? 1 : list.get(j);
                        for (int k = 0; k < space; ++k) {
                            wordNow.append(" ");
                            kill++;
                        }
                    }
                }
                /* next line please */
                if (kill < 0)
                    kill = 0;
                for (int k = 0; k < maxWidth - sum - space - kill; ++k) {
                    wordNow.append(" ");
                }
                result.add(String.valueOf(wordNow));
                wordNow.setLength(0);
                start = i + 1;
                sum = 0;
            }
        }
        return result;
    }
    
    public List<Integer> spaceIndex(int total, int div) {
        if (div == 0)
            return new ArrayList<>();
        int smallNum = total / div;
        int smalls = (smallNum + 1) * div - total;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < div - smalls; ++i)
            result.add(smallNum + 1);
        for (int i = 0; i < smalls; ++i)
            result.add(smallNum);
        return result;
    }
}
