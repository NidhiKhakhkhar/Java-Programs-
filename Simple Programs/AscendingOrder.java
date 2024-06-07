
import java.util.Scanner;

public class AscendingOrder {
    public void order(int n1,int n2,int n3){
        int min = (n1 < n2 ? n1 : n2);
        min = (min < n3 ? min : n3);
        int max = (n1> n2? n1:n2);
        max = (max > n3 ? max : n3);
        int mid = n1 +n2 +n3 -min -max;
        System.out.println(min + " " + mid + " " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter number : ");
        int n3 = sc.nextInt();
        AscendingOrder a = new AscendingOrder();
        a.order(n1, n2, n3);
    }
}
