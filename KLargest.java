import java.util.PriorityQueue; 

public class KLargest{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void kLargest(int arr[],int k){
        int n = arr.length;

        //sort in ascending 
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        //reverse the array
        int ans[] = new int[n];
        for(int i=n-1;i>=0;i--){
            ans[n-i-1] = arr[i];
        } 
        
        //print kth largest element 
        System.out.print(ans[k-1]);

    }

    public int findKthLargest(int nums[] ,int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        for(int num : nums){
            minHeap.add(num);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args){
        int[] arr = {1,3,5,6,4,2};
        int k = 3;
        KLargest kl = new KLargest();
        System.out.println("Output: " + kl.findKthLargest(arr,3));
        kLargest(arr,k);
    }
}