
import java.util.Scanner;

public class OddOrEvenWithoutIfElse {
    public void isEvenOrOdd(int n){
        int number = n;
        String[] numbers = {"Even","Odd"};
        System.out.println("Number is " + numbers[number & 1] + ".");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        OddOrEvenWithoutIfElse x = new OddOrEvenWithoutIfElse();
        x.isEvenOrOdd(n);
    }
}
