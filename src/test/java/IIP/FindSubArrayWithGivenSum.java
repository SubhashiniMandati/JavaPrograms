package IIP;

public class FindSubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 20, 3, 10, 5};
        int expectedSum = 33;

        findSubarray(numbers, expectedSum);
    }

    static void findSubarray(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;

            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];

                if (currentSum == sum) {
                    System.out.println("Subarray found from index "
                            + i + " to " + j);
                    for(int k=i;k<=j;k++){
                        System.out.print(arr[k] + " ");
                    }
                    return;
                }
            }
        }
        System.out.println("No subarray found");
    }
}

