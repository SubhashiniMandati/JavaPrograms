package Streams;

import java.util.Arrays;
import java.util.Comparator;
public class SecondHighestElementInArray{
    public static void main(String[] args) {
        int[] nums={1,2,5,6,3,8,7};
        System.out.println(secondHighest(nums));
    }

private static int secondHighest(int[] nums){
    return Arrays.stream(nums)
            .boxed()
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst().get();
}
private void validate(int[] nums){
        if(nums==null || nums.length<2){
            throw new InvalidInputException("Array must contain at least two elements");
        }
}
}
class InvalidInputException extends RuntimeException{
    public InvalidInputException(String message){
        super(message);
    }
}
