public class ValidPalindrome{
    public boolean isPalindrome(String s){
        if(s == null || s.isEmpty()) return true;

        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int left=0, right = s.length()-1;

        while(left<right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args){
        ValidPalindrome vp = new ValidPalindrome();

        String s = "A man, a plan, a canal: Panama";
        //String s = "/--+@#$%^&*()";
        System.out.print("Given string " + s + " is " + vp.isPalindrome(s));

    }
}