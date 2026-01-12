package IIP;

public class FindSmallestLargestSecondLargestNum {
    public static void main(String[] args) {
        int[] arr ={15,13,19,11,17};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            } else if (num>secondLargest && num!=largest) {
                secondLargest=num;
            }
            if(num<min){
                min=num;
            }
        }
        System.out.println("largest"+largest);
        System.out.println("secondLargest" +secondLargest);
        System.out.println("min" +min);
    }

}
