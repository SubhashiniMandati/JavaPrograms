package sdetPractice;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class JoinListOfStringsWithPrefixSufixDelimiter {
    public static void main(String[] args) {
        List<String> input= List.of("Subhashini", "ravi", "Rohith", "Rishika");
        System.out.println(joinStrings(input," ,","{","}"));
    }
    private static String joinStrings(List<String> input, String delimiter, String prefix, String suffix){
return input.stream()
        .filter(Objects::nonNull)
        .collect(Collectors.joining(delimiter,prefix, suffix));
    }
}
