import java.util.ArrayList;
import java.util.Scanner;

public class UnionArrayOptimal{
  public static void main(String args[]){
    int n1;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size:");
    n1 = sc.nextInt();

    int arr1[] = new int[n1];
    System.out.print("Enter array elements:");
    for(int i=0;i<n1 ;i++){
      arr1[i] = sc.nextInt();
    }

    int n2;
    Scanner sc1 = new Scanner(System.in);
    System.out.print("Enter array size:");
    n2 = sc1.nextInt();

    int arr2[] = new int[n2];
    System.out.print("Enter array elements:");
    for(int i=0;i<n2 ;i++){
      arr2[i] = sc.nextInt();
    }

    // Two Pointer Union Array.
    int i =0,j=0;
    ArrayList<Integer> union = new ArrayList<>();
    System.out.print("Union of arrays :[");
    while(i <n1 &&  j<n2){
      if(arr1[i] <arr2[j]){
        UnionFunc(union ,arr1[i]);i++;
      }
      else if(arr2[j]  <arr1[i]){
        UnionFunc(union ,arr2[j]);j++;
      }
      else{
        UnionFunc(union ,arr1[i]);
        i++; j++;
      }
    }
    // Remaining Element of first array
    while(i <n1){
      UnionFunc(union ,arr1[i]);
      i++;
    }
    // Remaining Element in second array.
    while(j < n2){
      UnionFunc(union ,arr2[j]);
      j++;
    }

    System.out.println("Union of Arrays:"+union);
    sc.close();
    sc1.close();
  }

  // Helper to avoid duplicates
  static void UnionFunc(ArrayList<Integer> union,int val){
    if(union.isEmpty() || union.get(union.size()-1)!= val){
      union.add(val);
    }
  }
}