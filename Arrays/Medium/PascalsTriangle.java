import java.util.Scanner;

public class PascalsTriangle{
  public static void main(String[] args) {
    int row ,col;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter row:");
    row = sc.nextInt();

    System.out.print("Enter column:");
    col = sc.nextInt();

    nCr(row-1,col-1);

    sc.close();
  }

  // Combination code for finding element
  static void nCr(int r ,int c){
    long res = 1;
    for(int i=0;i<c ;i++){
      res = res*(r-i);
      res = res/(i+1);

    }
    System.out.print("Element is :"+ res);
  }
}