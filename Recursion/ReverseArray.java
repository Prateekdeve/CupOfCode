// Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray{
  static void reverseArray(int arr[] ,int n){
    int i =0;
    int j = n-1;
    while(i<j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
    

    // // Ab reversed array banane ke liye loop
    // for(int k =0; k<n ;k++){
    //   System.out.println(arr[k]+" ");
    // }

    // For proper arrray format
    System.out.println("Reversed array = " + Arrays.toString(arr));
  }
  public static void main(String args[]){
    int n;
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements:");
    n = sc.nextInt();

    int arr[] = new int[n];
    System.out.print("Enter "+n+"elements :");
    for(int i =0 ;i<n ;i++){
      arr[i] = sc.nextInt();
    }

    // Ye original array check karne ke liye.
    System.out.println("Original array = " + Arrays.toString(arr));

    // Reversed array ke liye.
    reverseArray(arr ,n);
    sc.close();

  }
}