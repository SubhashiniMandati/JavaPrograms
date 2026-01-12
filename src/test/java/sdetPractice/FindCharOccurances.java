package sdetPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindCharOccurances {
    public static void main(String[] args) {
        String input ="This is subhashini";
        Map<Character,Long> output = input.toLowerCase().chars().filter(Character::isLetter).mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
        System.out.println(output);
    }
}
