package sdetPractice;

import java.util.List;

public class RemoveDulicatesFromList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,3,4);
        System.out.println(removeDulicates(numbers));
    }
   private static List<Integer> removeDulicates(List<Integer> nums){
        return nums.stream().distinct().toList();
   }
}
