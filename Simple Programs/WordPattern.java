
import java.util.Scanner;

public class WordPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = sc.next();
        for(int i=0;i<word.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}
