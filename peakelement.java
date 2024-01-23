import java.util.Scanner;

public class peakelemnt {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 
    System.out.println("enter the size of array:");
    int n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements of array : ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }
    for(int i=1;i<n-1;i++){
        if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
            System.out.print(arr[i]+" is peak element \n");
            
        }
    }
}
}
