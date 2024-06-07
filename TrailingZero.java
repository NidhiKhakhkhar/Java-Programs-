import java.util.Scanner;

public class TrailingZero {
    public int nTrailingZero(int n){
        int ans = n , count = 0;
        int num = n - 1;
        while(num > 0){
            ans = ans * num;
            num = num - 1; 
        }

        char[] arr = String.valueOf(ans).toCharArray();
        for(char a : arr){
            if(a == '0'){
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        sc.close();
        TrailingZero tz = new TrailingZero();
        System.out.println("Output : " + tz.nTrailingZero(n));
    }
}
