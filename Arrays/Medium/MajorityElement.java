import java.util.HashMap;
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

    // MajorityElementBruteForce(arr ,n);
    int majorityElem = MajorityElemMapapp(arr ,n);
    System.out.println("Majority Element is:"+majorityElem);
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

  // Better approach -> Map 
  static int MajorityElemMapapp(int arr[] ,int n){
    HashMap<Integer ,Integer> map = new HashMap<>();
    for(int i=0;i<n;i++){
      int freq = map.getOrDefault(arr[i],0)+1;
      map.put(arr[i] ,freq);

      // Check if immediately it crosses n/2
      if(freq > n/2){
        return arr[i];
      }
    }
    // No majority element
    return -1;
  }
}