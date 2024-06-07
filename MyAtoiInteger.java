import java.util.Scanner;

public class MyAtoiInteger {
    public int MyAtoi(String s){
        String string = s.trim();
        int ans = Integer.parseInt(string);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String s = sc.nextLine();
        sc.close();
        MyAtoiInteger mAtoi = new MyAtoiInteger();
        System.out.println(mAtoi.MyAtoi(s));
    }
}
