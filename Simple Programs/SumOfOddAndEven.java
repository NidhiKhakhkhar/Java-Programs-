
import java.util.Scanner;

public class SumOfOddAndEven {
    public void sumOfOddEven(int arr[]){
        int sumOfodd = 0,sumOfEven = 0;
        int[] array = arr;

        for(int i = 0 ; i<arr.length;i++){
            if(arr[i] %2 == 0){
                sumOfEven += arr[i];
            }
            else{
                sumOfodd += arr[i];
            }
        }

        System.out.println("Sum of even : " + sumOfEven);
        System.out.println("Sum of odd : " + sumOfodd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter array element : ");
            arr[i] = sc.nextInt();
        }
        SumOfOddAndEven sum = new SumOfOddAndEven();
        sum.sumOfOddEven(arr);
    }
}
