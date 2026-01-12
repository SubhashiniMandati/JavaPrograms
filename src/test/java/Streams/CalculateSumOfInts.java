package Streams;

public class CalculateSumOfInts {
    public static void main(String[] args) {
        int input=12345;
        System.out.println(calculateSum(input));
    }
    private static int calculateSum(int input){
        return String.valueOf(input).chars()
                .map(ch->ch-'0')
                .sum();
    }
    private void validate(int input){
        if(input<0){
            throw new InvalidInputException("Input number must not be negative");
        }
    }
}
