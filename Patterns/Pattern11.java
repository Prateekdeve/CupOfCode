import java.util.Scanner;

public class Pattern11 {
  public static void main(String[] args) {
    int n ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n :");
    n = sc.nextInt();
    
    for(int i =1;i <= n ;i++){
      // With loop
      // for(int j = 1 ;j <= i;j++){
      //   if((i +j)  % 2 == 0){
      //     System.out.print(1);
      //   }else{
      //     System.out.print(0);
      //   }
      // }
      // System.out.println(" ");

      // Without inner loop
      int j =1;
      while(j <=i){
        if((j+i) % 2 == 0){
          System.out.print(1);
        }else{
          System.out.print(0);
        }
        j++;
      }
      System.out.println();
    }

  }
}
