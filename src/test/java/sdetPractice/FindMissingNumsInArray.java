package sdetPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingNumsInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7};
        int n = 7;
        Set<Integer> set= Arrays.stream(arr).boxed().collect(Collectors.toSet());
        List<Integer> missing= IntStream.rangeClosed(1,n).filter(i->!set.contains(i)).boxed().collect(Collectors.toList());
        System.out.println(missing )    ;
    }
}
