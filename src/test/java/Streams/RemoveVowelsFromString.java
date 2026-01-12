package Streams;

import java.util.Set;
import java.util.stream.Collectors;
public class  RemoveVowelsFromString {
    private static final Set<Character>VOWELS =Set.of('A','E','I','O','U','a','e','i','o','u');
    public static void main(String[] args) {
        String str="Subhashini";

        System.out.println(removeVowels(str));
    }
    public static String removeVowels(String str){
        if(str ==null || str.isBlank()){
            return str;
        }
        return str.chars().mapToObj(ch->(char)ch)
        .filter(ch->!VOWELS.contains(ch))
             .map(String::valueOf).
                collect(Collectors.joining());
    }

}
