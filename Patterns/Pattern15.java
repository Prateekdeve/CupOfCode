import java.util.Scanner;

public class Pattern15{
  public static void main(String[] args) {
    int n ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    n = sc.nextInt();
  
    for(int i =n;i>=0 ;i--){
      for(int j =0;j<i ;j++){
        System.out.print((char) ('A' +j));
      }
      System.out.println(" ");
    }
  }
}

// Target Pattern 
// ABCDE
// ABCD
// ABC
// AB
// A