
import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            ans = ans + i;
            System.out.print(ans + " ");
        }
    }
}
