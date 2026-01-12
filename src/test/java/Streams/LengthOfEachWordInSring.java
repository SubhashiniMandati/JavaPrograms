package Streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class LengthOfEachWordInSring {
    public static void main(String[] args) {
        String input="My name is subhashini is";
        System.out.println(lengthOfWords(input));

    }
    private static Map<String,Integer> lengthOfWords(String input){
        isInputValid(input);
        return Arrays.stream(input.split("\\s+"))
                .collect(Collectors.toMap(
                        word->word,
                        String::length,
                        (existing,replacement)->existing,
                        LinkedHashMap::new));
    }
    private static void isInputValid(String input){
        if(Objects.isNull(input) || input.isEmpty()){
            throw new IllegalArgumentException("Input must not be null or empty");
        }
    }
}
