public class BubbleSort{
    public static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void bubbleSort(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr,n);
        
    }

    public static void main(String[] args){
        int n = 5;
        int arr[] = {50,20,40,60,30};
        bubbleSort(arr,n);
    }
}