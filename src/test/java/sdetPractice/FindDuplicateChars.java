package sdetPractice;

import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateChars {
    public static void main(String[] args){
String input ="subhashini";
Map<Character,Long> duplicates= input.chars().mapToObj(c->(char) c).
        collect(Collectors.groupingBy(c -> c, Collectors.counting())).
        entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(duplicates);
    }

}
