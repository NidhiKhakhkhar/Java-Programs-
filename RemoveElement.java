public class RemoveElement{
    public int removeElement(int[] arr, int val){
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != val){
                arr[index++] = arr[i];
            }
        }
        return index;
    }

    public static void main(String[] args){
        RemoveElement re = new RemoveElement();
        int[] arr = {2,2,3,3,5,6};
        System.out.print("New Length : " + re.removeElement(arr,3));
    }
}