public class SearchInsertPosition{
    public int searchInsert(int[] arr , int target){
        int left=0, right = arr.length -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) left = mid+1;
            else right = mid-1;
        }
        return left;
    }

    public static void main(String[] args){
        SearchInsertPosition si = new SearchInsertPosition();
        int[] arr = {1,3,4,9,10};
        int target = 10;
        System.out.print("Index of given target is : " + si.searchInsert(arr,target));
    }
}