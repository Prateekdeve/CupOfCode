import java.util.Scanner;

public class LargestElem{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of the array:");
    n = sc.nextInt();

    int arr[] = new int[n];
    System.out.print("Enter elements:");
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    // Finding the max element in the array
    int max = arr[0];
    for(int i=0; i<n ;i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }
    System.out.println("Largest element in array ="+max);

    sc.close();
  }
}