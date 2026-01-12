package Streams;

import java.util.Arrays;
import java.util.List;

public class CountOfParticularWordFromList {
    public static void main(String[] args) {
        List<String> wordsList = Arrays.asList("Java sharp Java", "Ruby Java Go", "Java html Java");
        System.out.println(wordCount(wordsList,"java"));
    }
    private static long wordCount(List<String> wordsList, String targetWord ){
        validate(wordsList,targetWord);
        return wordsList.stream()
                .flatMap(word->Arrays.stream(word.split("\\s+")))
                .filter(word -> word.equalsIgnoreCase(targetWord))
                .count();
    }
    private static void validate(List<String> sentences, String targetWord) {
        if (sentences == null || sentences.isEmpty()) {
            throw new InvalidInputException(
                    "Sentence list must not be null or empty"
            );
        }
        if (targetWord == null || targetWord.isBlank()) {
            throw new InvalidInputException(
                    "Target word must not be null or empty"
            );
        }
    }
}
