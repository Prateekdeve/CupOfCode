import java.util.Scanner;

public class Patternsix{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of n :");
    n = sc.nextInt();
    for(int i =n; i >= 1 ;i--){
      for(int j =1 ;j <=i ;j++){
        System.out.print(j);
        
      } 
      System.out.println(" ");
      
    }

  }
}

// Target Pattern 
// 12345
// 1234
// 123
// 12
// 1