package sdetPractice;

public class ReverseString {
    public static void main(String[] args) {
        String input = "subhashini";
        String output= input.chars().mapToObj(c->(char) c).reduce("", (rev,ch)->ch+rev, (s1,s2) ->s1+s2);
        System.out.println(output);
    }

    public static String reverse(String input) {
        char[] chars = input.toCharArray();
        StringBuilder output = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            output.append(chars[i]);
        }
        return output.toString();
    }
}
