import java.util.Scanner;

public class PascalsTriangle{
  public static void main(String[] args) {
    int row ,col;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter row:");
    row = sc.nextInt();

    System.out.print("Enter column:");
    col = sc.nextInt();

    // Function ot find element at particular row and column.
    //nCrFindElement(row-1,col-1);

    // Function to Print a particularRow
    nCrPrintRow(row);

    // Printing the entire Pascal's triangle(Brute Force)
    System.out.println("Enter n:");
    int n = sc.nextInt();
    //PrintPascalTriangleBrute(n);

    // Printing Pascal's Triangle Optimal
    PrintPascalTriangleOptimal(n);
    sc.close();

  }

  // A -> Combination code for finding element
  static void nCrFindElement(int r ,int c){
    long res = 1;
    for(int i=0;i<c ;i++){
      res = res*(r-i);
      res = res/(i+1);

    }
    System.out.print("Element is :"+ res);
  }

  // B-> Print a particular row
  static void nCrPrintRow(int row){
    long ans = 1;
    System.out.print("Row "+row +
     " :"
    );
    for(int col =1;col <= row ;col++){
      System.out.println(ans+" ");
      ans = ans *(row -col);
      ans = ans/col;
    }
    System.out.println();
  }

  // nCr Calculation Function
  static long nCr(int n ,int r){
    long res =1;
    for(int i =0;i<r ;i++){
      res = res*(n-i);
      res = res / (i+1);
    }
    return res;
  }

  // C-> Print Pascal's triangle Brute-Force
  static void PrintPascalTriangleBrute(int n){
    System.out.println("Pascal's Triangle for n ="+n);
    for(int row =1;row <= n;row++){
      for(int col =1;col <= row ;col++){
        System.out.print(nCr(row-1 ,col-1)+" ");
      }
      System.out.println();
    }
  }

  // C-> Print Pascal's Triangle Optimal Approach 
  static void PrintPascalTriangleOptimal(int n){
    System.out.println("Pascal's Triangle (Optimal)");
    for(int row=1;row<= n;row++){
      generateRow(row);
    }
  }

  // Generating Rows
  static void generateRow(int row){
    long ans = 1;
    System.out.print(ans+" ");
    for(int col =1;col < row ;col++){
      ans = ans * (row - col);
      ans = ans /col;
      System.out.print(ans+" ");
    }
    System.out.println();
  }
}