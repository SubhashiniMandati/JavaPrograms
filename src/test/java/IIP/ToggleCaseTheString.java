package IIP;
import java.util.stream.Collectors;

public class ToggleCaseTheString {
    public static void main(String[] args) {
        String input="JaVa@123#Pro!";
        System.out.println(toggleCase(input));

    }
    private static String toggleCase(String input){
        return input.chars()
                .mapToObj(ch-> {
                    if (Character.isUpperCase(ch)) {
                        return Character.toLowerCase((char) ch);
                    } else if (Character.isLowerCase(ch)) {
                        return Character.toUpperCase((char) ch);
                    } else {
                        return (char) ch;
                    }
                })
                .filter(Character::isAlphabetic)
            .map(String::valueOf)
                .collect(Collectors.joining());


    }
}
