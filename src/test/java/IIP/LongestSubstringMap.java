package IIP;
import java.util.HashMap;
import java.util.Map;

public class  LongestSubstringMap {

    public static String longestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int start = 0, maxLen = 0, startIndex = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }

            map.put(c, end);

            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                startIndex = start;
            }
        }
        return s.substring(startIndex, startIndex + maxLen);
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));
    }
}
