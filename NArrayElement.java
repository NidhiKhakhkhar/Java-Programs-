import java.util.*;

public class NArrayElement{
    public static List<Integer> majorityElement(int[] v){
        int n = v.length;
        List<Integer> ls = new ArrayList<>();

        HashMap<Integer,Integer> mpp = new HashMap<>();

        int mini = (int)(n/3) + 1;

        for(int i=0;i<n;i++){
            int value = mpp.getOrDefault(v[i],0);
            mpp.put(v[i],value + 1);

            if(mpp.get(v[i]) == mini){
                ls.add(v[i]);
            }

            if(ls.size() == 2) break;
        }

        return ls;
    }

    public static void main(String[] args){
        int[] arr = {11,33,33,11,11,33};
        List<Integer> ans = majorityElement(arr);

        System.out.print("The majority elements are : ");

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}