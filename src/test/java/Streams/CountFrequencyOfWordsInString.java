package Streams;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountFrequencyOfWordsInString {
    public static void main(String[] args){
        String input="java ruby Java html";
        System.out.println(wordsCount(input));
    }
    public static Map<String,Long> wordsCount(String input) {
        if (Objects.isNull(input) || input.isBlank()) {
            return Collections.emptyMap();
        }
        return tokenize(input)
                .collect(Collectors.collectingAndThen(
                        Collectors.groupingBy(
                                word->word,Collectors.counting()
                        ),
                        Collections::unmodifiableMap
                ));
    }
    public static Stream<String> tokenize(String input){
        return Stream.of(input.split("\\s+  "))
                .map(String::trim)
                .map(String::toLowerCase)
                .filter(word->!word.isBlank());
    }
}
