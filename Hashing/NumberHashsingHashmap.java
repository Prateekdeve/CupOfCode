import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class NumberHashsingHashmap{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array length:");
    n = sc.nextInt();
    int[] arr = new int[n];
    // Input array
    for(int i =0;i<n;i++){
      System.out.println("Enter number:");
      arr[i]= sc.nextInt();
    }

    // Precompute
    HashMap<Integer ,Integer> freqmp = new HashMap<>();
    for(int i =0 ;i<n;i++){
      freqmp.put(arr[i],freqmp.getOrDefault(arr[i],0)+1);
    }

    int q;
    System.out.print("Enter number of queries :");
    q= sc.nextInt();
    while(q-- >0){
      // Fetch
      int num;
      System.out.print("Enter number to find frequency:");
      num = sc.nextInt();
      System.out.println(freqmp.getOrDefault(num, 0));

    }
  }
}
// Target count the frequency of numbers in an array using a hashmap.