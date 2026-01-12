package sdetPractice;

import java.util.Arrays;

public class FindMissingNumInArr {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5}; // Missing = 3
        int n = 5;
        int expectedSum=n*(n+1)/2;
        int actualSum= Arrays.stream(arr).sum();
        System.out.println(expectedSum-actualSum);


    }
}
