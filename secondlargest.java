import java.util.Scanner;

public class secondLarge {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 
    System.out.println("enter the size of array:");
    int n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements of array : ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }
  if(n<2){
    System.out.println("Invalid input,array should have atleast two elements.");
  }
  int largest=0;
  int secondLarge=0;
  //Finding the largest element in the array
  for(int i=1;i<n;i++){
    largest=Math.max(largest,arr[i]);

  }
  //finding second largest element in the array
  for(int i=0;i<n;i++){
     if(arr[i]!=largest){
        secondLarge=Math.max(secondLarge,arr[i]);
     }
  }
  if(secondLarge==0){
    System.out.println("There is no second largest element in the array.");
  }
  else{
    System.out.println("The second largest element in the array is "+secondLarge);
  }
}
}
