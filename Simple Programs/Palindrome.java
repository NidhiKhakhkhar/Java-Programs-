
import java.util.Scanner;

public class Palindrome {
    public void isPalindrome(int n){
        int r = 0,temp = n;
        while(temp > 0){
            r = r*10 + (temp%10);
            temp = temp/10;
        }
        if(r == n){
            System.out.println(n + " is Palindrome");
        }
        else{
            System.out.println(n + " is Non-Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        Palindrome p = new Palindrome();
        p.isPalindrome(n);
    }
}
