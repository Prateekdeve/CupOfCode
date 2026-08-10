// Print sum of first 100 integers.
public class WhileExample {
  public static void main(String[] args) {
    int sum = 0;
    int n =1;
    while (n<=100){
      sum += n;
      n++;
    }
    System.out.println(sum);
  }
}
