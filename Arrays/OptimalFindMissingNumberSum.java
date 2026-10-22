import java.util.Scanner;

public class OptimalFindMissingNumberSum{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n:");
    n= sc.nextInt();

    int arr[] = new int[n];

    
    System.out.print("Enter array elements:");
    for(int i=0;i<n-1;i++){
      arr[i] = sc.nextInt();
    }

    // Sum method
    // int missingNumber = missingNumberSum(arr ,n);
    // System.out.println("Misiing Number"+missingNumber);

    int missingNumber = missingNumberXOR(arr ,n);
    System.out.print("Missing Number"+missingNumber);
    sc.close();
  }
  static int missingNumberSum(int arr[] ,int n){
    // Sum of numbers form1 to n
    int sum = n * (n+1)/2;

    // Sum of array elements
    int sum2 =0;
    
    for(int i =0 ;i < arr.length; i++){
      sum2 += arr[i];
    }

    // Missing number
    return sum - sum2;
  }

  static int missingNumberXOR(int arr[] ,int n){
    int xor1 = 0 ,xor2 =0;
    int N = n-1;
    for(int i =0;i <N ;i++){
      xor2 = xor2 ^ arr[i];
      xor1 = xor1 ^ (i+1);

    }
    xor1 = xor1 ^ n;
    return xor1 ^xor2;
  }
}