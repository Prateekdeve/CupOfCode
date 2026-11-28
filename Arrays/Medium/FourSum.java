
import java.util.Scanner;
public class FourSum{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size:");
    n = sc.nextInt();

    System.out.println("Enter array elments:");
    int arr[]  = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    BruteForce(arr ,n);

    sc.close();
  }

  static void BruteForce(int arr[],int n){

  }
}