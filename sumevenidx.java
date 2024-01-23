import java.util.*;
public class sumevenIdx {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 
    System.out.println("enter the size of array:");
    int n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements of array : ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }
    SumEvenIndices(arr);
}
    
   public static void SumEvenIndices(int[]arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
          if(i%2==0){
               sum+=arr[i];
          }
    }
    System.out.println("Sum of even number in array is "+sum);
}
}
