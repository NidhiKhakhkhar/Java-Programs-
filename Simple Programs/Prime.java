
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        Prime p = new Prime();
        p.isPrime(n);
    }

    public void isPrime(int n){
        boolean flag = false;
        for(int i=2;i<n/2;i++){
            if(n%i == 0){
                flag = true;
                break;
            }

        }
        if(!flag){
            System.out.println(n + " is Prime");
        }
        else{
            System.out.println(n + " is Non-Prime");
        }
    }
}
