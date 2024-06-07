import java.util.*;
public class BinaryToDecimal{
    public double toDecimal(String binary){
        String[] bStrings = binary.split("[.]");
        double ans = 0;
        for(int i = 0;i<bStrings.length;i++){
            char[] arr = bStrings[i].toCharArray();
            if(i==0){
                for(int j=arr.length-1;j>=0;j--){
                    if(arr[j] == '1'){
                        ans += Math.pow(2, (arr.length-j-1));
                    }
                }
            }
            else{
                for(int j=0;j<arr.length;j++){
                    if(arr[j] == '1'){
                        ans += Math.pow(2, -(j+1));
                    }
                }
            }
            
        }
        return ans;
        
    }

    public static void main(String[] args) {
        BinaryToDecimal btd = new BinaryToDecimal();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary string : ");
        String binaryString = sc.nextLine();
        sc.close();
        System.out.println("Output: " + btd.toDecimal(binaryString));
    }
}