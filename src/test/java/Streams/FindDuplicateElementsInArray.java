package Streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class FindDuplicateElementsInArray {
    public static void main(String[] args) {
List<Integer> input=List.of(1,4,6,3,1,6,7,6);
        System.out.println(duplicates(input));
    }
    private static Set<Integer> duplicates(List<Integer> input){
Set<Integer> seen= new HashSet<>();
        return input.stream().
        filter(i->!seen.add(i))
                .collect(Collectors.toSet());

    }
}
