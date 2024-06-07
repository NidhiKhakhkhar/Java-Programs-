
import java.util.Scanner;

public class OddOrEvenUsingBitwise {
    public void isOddOrEven(int n){
        if((n & 1) == 1){
            System.out.println( n + " is Odd");
        }
        else{
            System.out.println(n + " is Even");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        OddOrEvenUsingBitwise bitwise = new OddOrEvenUsingBitwise();
        bitwise.isOddOrEven(n);
    }
}
