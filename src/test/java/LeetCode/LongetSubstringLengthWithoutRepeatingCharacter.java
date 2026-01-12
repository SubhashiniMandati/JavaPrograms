package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LongetSubstringLengthWithoutRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbbabcd"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastIndex = new HashMap<>();
        int left = 0; int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (lastIndex.containsKey(c) && lastIndex.get(c) >= left)
            {
                left = lastIndex.get(c) + 1;
            }
            lastIndex.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        } return maxLength;
    }

    /**iven a string s, find the length of the longest substring without duplicate characters.



     Example 1:

     Input: s = "abcabcbb"
     Output: 3
     Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
     Example 2:

     Input: s = "bbbbb"
     Output: 1
     Explanation: The answer is "b", with the length of 1.
     Example 3:

     Input: s = "pwwkew"
     Output: 3
     Explanation: The answer is "wke", with the length of 3.
     Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


     Constraints:

     0 <= s.length <= 5 * 104
     s consists of English letters, digits, symbols and space */
}
