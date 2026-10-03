// Give an array of size n 
// Task := Sort its elements in ascending order

import java.util.Scanner;

public class SelectionSort{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array :");
    n = sc.nextInt();

    // Creating the array
    int arr[] = new int[n];
    for(int i =0 ;i<n;i++){
      arr[i] = sc.nextInt();
    }

    Selectsort(arr ,n);
    System.out.println("Sorted Array :");
    for(int i=0;i<n ;i++){
      System.out.print("["+arr[i]+"]");
    }
    sc.close();
  }
  static void Selectsort(int arr[] ,int n){
    
    for(int i = 0;i< n-1;i++){
      int mini = i;
      for(int j = i;j<=n-1;j++){
        if(arr[j] <arr[mini]){
          mini =j;
        }
        
      }
      // Swapping Logic
      int temp = arr[mini];
      arr[mini] = arr[i];
      arr[i] = temp;
    }
  }
}