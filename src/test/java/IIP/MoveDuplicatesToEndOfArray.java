package IIP;

public class MoveDuplicatesToEndOfArray {
    public static void main(String[] args) {
        int[] arr= {1,4,6,3,2,1,7,2};
        moveduplicates(arr);
        for(int n:arr){
            System.out.print(n +" ");
        }

    }
    static void moveduplicates(int[] arr){
        int n=arr.length;
        int end=n-1;
        for(int i=0;i<end;i++){
            for(int j=i+1;j<=end;j++){
                if(arr[i]==arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[end];
                    arr[end]=temp;
                    end--;
                    j--;
                }
            }
        }
    }
}
