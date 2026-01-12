package IIP;

import java.util.stream.IntStream;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4};
        boolean isSorted= IntStream.range(1, arr.length)
                .allMatch(i->arr[i]>=arr[i-1]);
        System.out.println("isSorted" +isSorted);

    }
}
