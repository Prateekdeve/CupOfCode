// Find the second largest and second smallest element in an  array.

import java.util.Scanner;

public class SecondLargestAndSmallest {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size:");
    n = sc.nextInt();

    int arr[] = new int[n];
    System.out.print("Enter array elements:");
    for(int i=0;i<n ;i++){
      arr[i] = sc.nextInt();
    }

    int largest = Integer.MIN_VALUE;
    int secLargest = Integer.MIN_VALUE;

    // Largest Element
    for(int i=0;i<n;i++){
      if(arr[i] > largest){
        secLargest = largest;
        largest = arr[i];
      }
      else if(arr[i]> secLargest && arr[i] != largest){
        secLargest = arr[i];
      }
    }
    // Second Largest Element
    System.out.println("Second Largest Element :"+secLargest);


    // Smallest Element 
    int smallest = arr[0];
    int secSmallest = Integer.MAX_VALUE;

    for(int i =0;i<n;i++){
      if(smallest > arr[i]){
        secSmallest = smallest;
        smallest = arr[i];
      }else if(arr[i] != smallest && secSmallest >arr[i]){
        secSmallest = arr[i];
      }
    }

    System.out.println("Smallest element "+smallest);

    System.out.println("Second smallest element: "+secSmallest);

    sc.close();

  }
}
