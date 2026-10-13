import java.util.Scanner;

public class LeftRotateDPlace{
  public static void main(String args[]){
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size:");
    n = sc.nextInt();

    int arr[] = new int[n];
    System.out.print("Enter elements:");
    for(int i=0; i<n ;i++){
      arr[i] = sc.nextInt();
    }
    
    int d;
    System.out.print("Tell what amount to rotate(d) :");
    d= sc.nextInt();
    LeftrotateArrayDPlace(arr ,n ,d);

    System.out.print("Array after rotation: [ ");
    for(int i=0; i<n ;i++){
      System.out.print(arr[i]+ " ");
    }
    System.out.print("]");
    sc.close();
  }

  static void LeftrotateArrayDPlace(int arr[] ,int n ,int d){
    d = d % n;

    // Temporary array to store elements to rotate at last
    int temp[] = new int[d];
    for(int i =0;i<d; i++){
      temp[i] = arr[i];
    }
    
    // Shifting the elements leftward d places.
    for(int i = d; i<n ;i++){
      arr[i-d] = arr[i];
    }

    // Pusing back the element from the temp 
    for(int i = n-d ;i < n;i++){
      arr[i] = temp[i - (n-d)];
    }

  }
}