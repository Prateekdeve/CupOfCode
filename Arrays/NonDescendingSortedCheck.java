// Given an array of size n check whether its elements are stored in a non-descending/ascending order.

import java.util.Scanner;

public class NonDescendingSortedCheck{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size:");
    n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter array elements:");
    for(int i=0;i<n;i++){
      arr[i]= sc.nextInt();
    }
    
    boolean result = isSorted(n ,arr);

    if(result){
      System.out.println("Array is sorted in non-descending order.");
    }else{
      System.out.println("Array is NOT sorted.");
    }

    sc.close();
  }

  static boolean isSorted(int n ,int arr[]){
   
    for(int i = 1; i < n; i++){
     
      if(arr[i] < arr[i-1]){
        return false;
      }
    }
  
    return true;
  }
}
