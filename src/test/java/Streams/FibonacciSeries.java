package Streams;

import java.util.List;
import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
    private static List<Integer> fibonacci(int n){
        return Stream.iterate(new int[]{0,1}, arr-> new int[]{arr[1], arr[0]+arr[1]})
                .limit(n)
                .map(arr->arr[0])
                .toList();
    }

}
