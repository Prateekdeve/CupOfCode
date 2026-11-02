import java.util.Scanner;

// Given an array of size n. Find element which comes more than n/2 times.
public class MajorityElement{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size:");
    n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter elements:");
    for(int i =0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    MajorityElementBruteForce(arr ,n);
    sc.close();
  }
  static void MajorityElementBruteForce(int arr[] ,int n){
    boolean found = false;
    for (int i = 0; i < n; i++) {
      int count =0;
      for(int j =0;j<n;j++){
        if(arr[j] == arr[i]){
          count++;
        }
      }
      if(count > n/2){
        System.out.print("Max element is "+arr[i]);
        found = true;
        break;
      }
    }if(!found){
      System.out.println("No such element!");
    }
    
  }
}