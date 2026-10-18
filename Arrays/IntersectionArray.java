import java.util.Scanner;
import java.util.ArrayList;

public class IntersectionArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // First array
    System.out.print("Enter size of first array: ");
    int n1 = sc.nextInt();
    int arr1[] = new int[n1];
    System.out.print("Enter elements of first array: ");
    for(int i=0; i<n1; i++){
      arr1[i] = sc.nextInt();
    }

    // Second array
    System.out.print("Enter size of second array: ");
    int n2 = sc.nextInt();
    int arr2[] = new int[n2];
    System.out.print("Enter elements of second array: ");
    for(int i=0; i<n2; i++){
      arr2[i] = sc.nextInt();
    }

    // Intersection logic (like uploaded C++ code)
    ArrayList<Integer> intersection = new ArrayList<>();
    boolean[] vis = new boolean[n2]; // track visited elements in arr2

    for(int i=0; i<n1; i++){
      for(int j=0; j<n2; j++){
        if(arr1[i] == arr2[j] && !vis[j]) {
          intersection.add(arr1[i]);
          vis[j] = true; // mark arr2[j] as used
          break; // move to next arr1[i]
        }
        if(arr2[j] > arr1[i]) break; // optimization if arrays are sorted
      }
    }

    // Print intersection
    System.out.println("Intersection of arrays: " + intersection);

    sc.close();
  }
}
