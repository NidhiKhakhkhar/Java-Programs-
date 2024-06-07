import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter square size : ");
        int n = sc.nextInt();
        System.out.print("Enter characher to be printed : ");
        String ch = sc.next();
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==(n-1) || j==(n-1)){
                    System.out.print(ch + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
