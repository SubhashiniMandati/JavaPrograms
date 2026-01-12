package sdetPractice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaximumAndMinimumInList {
    public static void main(String[] args) {
        List<Integer> input= List.of(5,1,7,9,10,45,100,56);
        Optional<Integer> min = input.stream().min(Comparator.naturalOrder());
        Optional<Integer> max = input.stream().max(Comparator.naturalOrder());
        System.out.println("min " + min);
        System.out.println("max "+ max);
    }
}
