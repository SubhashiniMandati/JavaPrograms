package IIP;

import java.util.Arrays;
import java.util.List;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4};
        System.out.println(removeDuplicates(arr));
    }
    static List<Integer> removeDuplicates(int[] arr){
        return Arrays.stream(arr).boxed()
                .distinct()
                .toList();
    }
}
