import java.util.Scanner;

public class traverseForeach {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 
    System.out.println("enter the size of array:");
    int n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements of array : ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }
    for(int even:arr){
        if (even%2==0){
            System.out.print(even+" ");
        }
    }
}
}
