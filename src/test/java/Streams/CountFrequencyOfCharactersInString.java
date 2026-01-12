package Streams;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountFrequencyOfCharactersInString {
    public static void main(String[] args) {
        String input="My name is subhashini";
        System.out.println(charFreqency(input));
    }
    public static Map<Character,Long> charFreqency(String input){
        if(Objects.isNull(input) ||input.isBlank()){
            return Collections.emptyMap();
        }
        return tokenize(input).
                collect(Collectors.collectingAndThen(
                        Collectors.groupingBy(c->c, Collectors.counting()),
                Collections::unmodifiableMap));
    }
    public static Stream<Character> tokenize(String input){
       return input.chars().filter(Character::isLetter)
               .map(Character::toLowerCase)
               .mapToObj(c->(char)c);
    }
}
