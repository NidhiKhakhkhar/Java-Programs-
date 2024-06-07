public class MedianOfTwoSortedArrays{
    private int[] mergeArrays(int[] num1, int[] num2){
        int m = num1.length , n = num2.length;
        int[] merged = new int[n+m];

        int i=0 , j=0, k=0;
        while(i<m && j<n){
            if(num1[i] < num2[j]){
                merged[k++] = num1[i++];
            }
            else{
                merged[k++] = num2[j++];
            }
        }

        while(i<m){
            merged[k++] = num1[i++];
        }
        while(j<n){
            merged[k++] = num2[j++];
        }
        return merged;
    }
    public double findMedianSortedArrays(int[] num1 , int[] num2){
        int[] mergedArray = mergeArrays(num1,num2);

        int n = mergedArray.length;
        if(n%2 == 0){
            return (mergedArray[n/2 - 1] + mergedArray[n/2])/2.0;
        }
        else{
            return mergedArray[n/2];
        }
    }

    public static void main(String[] args){
        MedianOfTwoSortedArrays ans = new MedianOfTwoSortedArrays();
        int[] num1 = {1,3};
        int[] num2 = {2};

        System.out.print("Output : " + ans.findMedianSortedArrays(num1,num2));
    }
}