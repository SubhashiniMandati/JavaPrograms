package sdetPractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateOddAndEven {
    public static void main(String[] args) {
        List<Integer> nums=List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(separateOddAndEve(nums));
    }
    private static Map<Boolean, List<Integer>> separateOddAndEve(List<Integer> nums){
        return nums.stream()
                .collect(Collectors.partitioningBy(i->i%2==0));
    }
//    private static Map<NumberType, List<Integer>> separateOddAndEve(List<Integer> nums){
//        return nums.stream().
//                collect(Collectors.groupingBy(
//                        NumberType::classify,
//                        Collectors.toUnmodifiableList()
//                ));
//
//    }
//    enum NumberType{
//        EVEN, ODD;
//        static NumberType classify(int n){
//            return n%2==0 ? EVEN : ODD;
//        }
//    }
}
