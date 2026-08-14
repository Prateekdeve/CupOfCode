import java.util.Scanner;

public class Patternfour{
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number :");
    num = sc.nextInt();

    for(int i = 1 ;i<=num ;i++){
      for(int j = 1 ;j<= i; j++){
        System.out.print(i);
      }
      System.out.println(" ");
    }
  }
}

// Pattern Output should be like ->
// 1
// 22
// 333
// 4444
// 55555

