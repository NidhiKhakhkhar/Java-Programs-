import java.util.Scanner;

public class LargestFromThree {

    public  int largestFromThree(int n1,int n2,int n3){
        int ans = (n1 > n2)?((n1>n3 ? n1:n3)) : ((n2>n3? n2:n3)); 
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter first num : ");
        int n1 = sc.nextInt();
        System.out.println("Enter second num : ");
        int n2 = sc.nextInt();
        System.out.println("Enter third num : ");
        int n3 = sc.nextInt();
        sc.close();
        LargestFromThree ans = new LargestFromThree();
        System.out.println("Largest number is : " + ans.largestFromThree(n1, n2, n3));

    }
}