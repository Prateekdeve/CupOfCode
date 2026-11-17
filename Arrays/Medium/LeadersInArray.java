import java.util.Scanner;

public class LeadersInArray {
  public static void main(String[] args) {
    int n;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter size of array:");
    n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter array elements:");  
    for (int index = 0; index < arr.length; index++) {
      arr[index] = sc.nextInt(); 
    }

    BruteForceLeaders(arr ,n);

    // OptimalFindingLeaders(arr ,n);
    
    sc.close();
  }

  static void BruteForceLeaders(int arr[],int n){
    System.out.println("Leaders are:");
    for(int i=0;i<n;i++){
      boolean leader = true;
      for(int j =i+1;j<n;j++){
        if(arr[j] >arr[i]){
          leader = false;
          break;
        }
      }
      if(leader){
      System.out.println(arr[i]+" ");
      }
    }
    
  }
}
