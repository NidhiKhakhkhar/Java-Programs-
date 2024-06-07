public class InsertionSort{
    public static void printArray(int arr[]){
        int n = arr.length;
        System.out.print("Sorted Array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int k = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > k){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = k;
        }
        printArray(arr);
    }

    public static void main(String[] args){
        
        int arr[] = {5,4,3,2,1};
        insertionSort(arr);
    }
}