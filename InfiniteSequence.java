import java.util.ArrayList;
import java.util.Scanner;

public class InfiniteSequence {
    public int nThDigit(int n){
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            if(i < 10){
                list.add(i);
            }
            else{
                char[] digit = String.valueOf(i).toCharArray();
                for(char a : digit){
                    list.add(a - '0');
                }
            }
        }

        return list.get(n-1);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        InfiniteSequence is = new InfiniteSequence();
        System.out.println("Output : " + is.nThDigit(n));
    }
}
