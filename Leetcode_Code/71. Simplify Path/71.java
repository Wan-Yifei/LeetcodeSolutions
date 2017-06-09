public class Solution {
    public String simplifyPath(String path) {
        if (path.length() == 0)
            return path;
        String pathA = path + "/";
        Stack<String> stack = new Stack<>();
        int start = 0, i = 0, dots = 0;
        boolean letter = false;
        while (i < pathA.length()) {
            if (pathA.charAt(i) == '.') {
                dots++;
            } else if (pathA.charAt(i) == '/' || pathA.charAt(i) == '\\') {
                if (i > start) {
                    if (dots == 2 && !letter) {
                        if (!stack.isEmpty())
                            stack.pop();
                    } else if (dots == 1 && !letter) {
                    } else
                        stack.add(pathA.substring(start, i));
                }
                if (i < pathA.length())
                    start = i + 1;
                /* reset */
                dots = 0;
                letter = false;
            } else {
                letter = true;
            }
            i++;
        }
        StringBuilder paths = new StringBuilder();
        while (!stack.isEmpty()) {
            paths.insert(0, stack.pop());
            paths.insert(0, "/");
        }
        if (paths.length() == 0)
            paths.append('/');
        return String.valueOf(paths);
    }
}
