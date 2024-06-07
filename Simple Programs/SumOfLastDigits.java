
import java.util.Scanner;

public class SumOfLastDigits {
    public int sumOfLastDigit(int num1,int num2){
        int num1Last = num1%10;
        int num2Last = num2%10;
        return (num1Last + num2Last);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();
        sc.close();
        SumOfLastDigits s = new SumOfLastDigits();
        System.out.println("Sum of Last Digits is : " + s.sumOfLastDigit(n1, n2));
    }
}
