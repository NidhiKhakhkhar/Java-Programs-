public class ReverseArray {
    public static void printArray(int ans[],int n){
        System.out.println("Reversed Array : ");
        for(int i=0;i<n;i++){
            System.out.print(ans[i] + " ");
        }
    }

    public static void reverseArray(int arr[],int n){
        int ans[] = new int[n];
        for(int i=n-1;i>=0;i--){
            ans[n-i-1] = arr[i];
        } 
        printArray(ans,n);
    }

    public static void main(String[] args){
        int n = 5;
        int arr[] = {5,3,2,4,1};
        reverseArray(arr,n);
    }

}