import java.util.Scanner;

public class BasicHashing{
  public static void main(String[] args) {
    int n ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n :");
    n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter "+n+" elements:");
    // Taking the input array
    for(int i =0 ;i<n ;i++){
      arr[i] = sc.nextInt();
    }

    // Precomputation Frequencies
    // int[] hash = new int[13];
    int[] hash = new int[100000];
    for(int i =0 ;i<n ;i++){
      hash[arr[i]]++;
    }
    
    // Process Queries->Kitne number search karna chahte ho wo dalo(Jaise 2 numer 1 or 5 kitni baar aaye hai to 2 dalo)
    System.out.print("Enter no of queries:");
    int q = sc.nextInt();
    while(q-- >0){
      int number = sc.nextInt();
      if(number >= 0 &&  number <hash.length){
        System.out.println("Frequency of"+number+" ="+hash[number]);
      }else{
        System.out.println("Invalid Query!");
      }
    } 
  }
}