import java.util.Scanner;

public class SortArrayof0s1s2s {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size:");
    n= sc.nextInt();

    int arr[] = new int[n];
    System.out.print("Enter array elements:");
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    sc.close();

    // Brute Force -> Using Count variable then sorting
    sort0s1s2s(arr ,n);
  }
  static void sort0s1s2s(int arr[] ,int n){
    int count0 =0;
    int count1 =0;
    int count2 =0;

    // Count 0s ,1s and 2a
    for(int i=0;i<n;i++){
      if(arr[i] == 0){
        count0++;
      }else if(arr[i] == 1){
        count1++;
      }else{
        count2++;
      }
    }
    // Fill 0s 
    for(int i=0;i<count0;i++){
      arr[i] =0;
    }
    // Fill 1s
    for(int i=count0;i<count0+count1;i++){
      arr[i] =1;
    }
    // Fill 2s
    for(int i = count0+count1 ;i<n;i++){
      arr[i] =2;
    }
    System.out.print("Final Array = [");
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.print("]");
  }
}
