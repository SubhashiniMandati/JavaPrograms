package sdetPractice;

import java.util.Comparator;
import java.util.List;

public class SortTheListInReverseOrder {
    public static void main(String[] args) {
        List<Integer> input= List.of(1,2,3,5,6,7,3,9,10);
        System.out.println(sortInReverse(input));
    }
    private static List<Integer> sortInReverse(List<Integer> input){
        return input.stream().distinct().sorted(Comparator.naturalOrder()).toList();
    }
}
