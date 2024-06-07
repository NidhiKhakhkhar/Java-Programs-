public class PalindromeNumber{
    public boolean isPalindromeNumber(int num){
        if(num < 0){
            return false;
        }

        int r=0,n = num;
        while(n>0){
            r = r*10 + n%10;
            n = n/10;
        }
        
        if(r == num){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args){
        PalindromeNumber pn = new PalindromeNumber();
        int num = 10;
        System.out.print("is Palindrome: " + pn.isPalindromeNumber(num));
    }
}