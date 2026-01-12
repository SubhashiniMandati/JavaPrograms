package LeetCode;

public class StringToInteger {
        public static void main(String[] args) {
            String input="1337c0d3";
            System.out.println(myAtoi(input));
        }
        public static int myAtoi(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }

            int index = 0;
            int sign = 1;
            long result = 0;

            // 1. Skip leading whitespaces
            while (index < s.length() && s.charAt(index) == ' ') {
                index++;
            }

            // 2. Handle optional sign
            if (index < s.length()) {
                if (s.charAt(index) == '-') {
                    sign = -1;
                    index++;
                } else if (s.charAt(index) == '+') {
                    index++;
                }
            }

            // 3. Convert digits
            while (index < s.length() && Character.isDigit(s.charAt(index))) {
                result = result * 10 + (s.charAt(index) - '0');

                // 4. Handle overflow
                if (sign * result > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (sign * result < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }

                index++;
            }

            // 5. Return final value
            return (int) (sign * result);
        }
    }
