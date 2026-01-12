package Streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input="subhashini";
        System.out.println(nonRepeating(input));
    }
    public static Map.Entry<Character,Long> nonRepeating(String input){
        validateInput(input);
        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new,
                        Collectors.counting()));
        return frequencyMap.entrySet()
                 .stream()
                .filter(entry->entry.getValue()==1).
                  findFirst().get();
    }
    private static void validateInput(String input){
if(input.isEmpty() || Objects.isNull(input)){
    throw new IllegalArgumentException("Input string must not be null or empty");
}
    }
}
