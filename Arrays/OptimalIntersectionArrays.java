import java.util.ArrayList;
import java.util.Scanner;

public class OptimalIntersectionArrays {
  public static void main(String[] args) {

    //First Array
    int n1;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n1:");
    n1 = sc.nextInt();
    int arr1[] = new int[n1];
    System.out.print("Enter first array elements:");
    for(int i=0;i<n1 ;i++){
      arr1[i] = sc.nextInt();
    }

    // Second Array
    int n2;
    Scanner sc1 = new Scanner(System.in);
    System.out.print("Enter n2:");
    n2 = sc1.nextInt();
    int arr2[] = new int[n2];
    System.out.print("Enter second array elements:");
    for(int i=0;i<n2 ;i++){
      arr2[i] = sc.nextInt();
    }

    // Two-Pointer Intersection
    int i =0 ,j =0;
    ArrayList<Integer> intersection = new ArrayList<>();
    while(i<n1 && j < n2){
      if(arr1[i] <arr2[j]){
        i++;
      }else if(arr2[j] <arr1[i]){
        j++;
      }else{
        intersection.add(arr1[i]);
        i++;
        j++;
      }
    }
    System.out.print("Intersection of arrays :"+intersection);

    sc.close();
    sc1.close();
  }
}
