package IIP;

public class MoveNegatiElementsToStartOfArray {
    public static void main(String[] args) {
        int[] arr={4,-1,5,-3,2,-9,0};
        moveNegativeElements(arr);
        for(int num:arr){
            System.out.print(num + " ");
        }

    }
    static void moveNegativeElements(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }

        }
    }
}
