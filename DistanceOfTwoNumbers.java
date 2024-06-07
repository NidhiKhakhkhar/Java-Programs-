import java.util.Scanner;

public class DistanceOfTwoNumbers {
    public int distanceOfTwo(int num1,int num2){
        int x = num1 , y = num2;
        int count = 0;

        while (x>0 || y>0) {
            if(x%2 != y%2){
                count++;
            }
            x = x/2;
            y = y/2;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        sc.close();
        DistanceOfTwoNumbers d = new DistanceOfTwoNumbers();
        System.out.println("Output : " + d.distanceOfTwo(num1, num2));
    }
}
