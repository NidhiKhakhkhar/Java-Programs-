import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateFromArray {
    public HashSet<Integer> removeDublicate(int arr[]){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int n = sc.nextInt();
        sc.close();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter array element : ");
            arr[i] = sc.nextInt();
        }

        RemoveDuplicateFromArray r = new RemoveDuplicateFromArray();
        System.out.println(r.removeDublicate(arr));
    }
}
