
import java.util.Scanner;
import java.util.TreeSet;

public class UnionofSortedArrays {
  public static void main(String[] args) {
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

    //Union of array 
    TreeSet<Integer> union = new TreeSet<>();
    for(int i =0;i<n1;i++){
      union.add(arr1[i]);
    }
    for(int j =0;j<n2;j++){
      union.add(arr2[j]);
    }

    System.out.print("Union of arrays:"+union);
    sc.close();
    sc1.close();
  }
}
