import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size: ");
    n = sc.nextInt();

    int arr[] = new int[n];
    System.out.print("Enter array elements:");
    for(int i=0 ;i<n;i++){
      arr[i] = sc.nextInt();
    }

    // Linear search function  
    System.out.print("Enter number to search:");
    int num =sc.nextInt();
    linearSearch(arr ,num);
    
    sc.close();
  }

  static void linearSearch(int arr[],int num){
    int n = arr.length;
    boolean found = false;
    for(int i =0 ;i<n;i++){
      if(arr[i] == num){
        System.out.print("Element found at index "+i);
        found = true;
        break;
      }
    }
    if(!found){
      System.out.println("Element not found");
    }
  }
}
