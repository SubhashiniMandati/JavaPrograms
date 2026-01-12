package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class LongestStringInArrayOfStrings {
    public static void main(String[] args) {
        String input ="My name is subhashini";
        System.out.println(longest(input));
    }
    private static String longest(String input){
        return Arrays.stream(input.split("\\s+"))
                .max(Comparator.comparingInt(String::length))
                .get();
    }
    private static void validate(String input){
        if(Objects.isNull(input)||input.isEmpty()){
            throw new InvalidInputException("Input should not be null or blank");
        }
    }
}
