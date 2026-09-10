import java.util.Scanner;

public class PrintNto1{
  static void Printnto1(int n){
    if(n<=0){
      return;
    }
    System.out.println(n);
    Printnto1(n-1);
    
  }
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of n:");
    n = sc.nextInt();
    Printnto1(n);

  }
}