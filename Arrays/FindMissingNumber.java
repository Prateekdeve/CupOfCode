import java.util.Scanner;

public class FindMissingNumber{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size:");
    n = sc.nextInt();
    
    int arr[] = new int[n];
    System.out.println("Enter array elements");
    for(int i =0; i<n ;i++){
      arr[i] = sc.nextInt();
    }
    
    int missingElem =findMissingElement(arr ,n);
    System.out.println("Missing number is :"+missingElem);

    sc.close();
  }

  // Brute-Force Approach(Linear Search)
  static int findMissingElement(int[] arr ,int n){
    for(int i=1;i<=n;i++){
      int flag =0;
      for(int j=0;j<n ;j++){
        if(arr[j] == i){
          flag = 1;
          break;
        }
      }
      if(flag == 0){
        return i;
      }
    }
    return -1;
  }
}