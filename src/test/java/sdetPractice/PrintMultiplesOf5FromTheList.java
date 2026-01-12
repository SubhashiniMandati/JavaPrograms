package sdetPractice;

import java.util.List;
public class PrintMultiplesOf5FromTheList {
    public static void main(String[] args) {
       List<Integer> input=List.of(1,4,5,9,10,40);
        System.out.println(multiplesOf5(input));
    }
    private static List<Integer> multiplesOf5(List<Integer> input){
        return input.stream().filter(i->i%5==0).toList();
    }
}
